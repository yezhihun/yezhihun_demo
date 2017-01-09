<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	request.setAttribute("app", request.getContextPath());
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>文章列表</title>

<!-- 新 Bootstrap 核心 CSS 文件 -->
<link href="${app}/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link href="${app}/dist/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">

<script src="${app}/dist/jquery/jquery.min.js"></script>
<script src="${app}/dist/jquery/masonry.pkgd.min.js"></script>
<script src="${app}/dist/jquery/masonry-docs.min.js"></script>

<script src="${app}/dist/js/bootstrap.min.js"></script>

<style type="text/css">
	.poem{
		font-size: 18px;
	    border-style: groove;
	}
</style>

<script type="text/javascript">
	$(function() {
		loadPoem();
	});
	
	var loadPoem = function(){
		var _url = "${app}/articleController/showArticleList";
		$.ajax({
			url: _url,
			type : "post",
			dataType : "json",
			success : function(data){
				var $container = $('.container');
				var $newContainer = createPoemDiv(data.list);
				
				$container.append($newContainer);
				$container.imagesLoaded( function(){
					$container.masonry({
						itemSelector : '.poem',
						gutterWidth : 20,
						isAnimated: true
					});
				});
			},
			error : function(err){
				alert(err);
			}
		});
	}
	
	var appendPoem = function(){
		var _url = "${app}/articleController/showArticleList";
		$.ajax({
			url: _url,
			type : "post",
			dataType : "json",
			success : function(data){
				var $container = $('.container');
				var $newContainer = createPoemDiv(data.list).css('opacity', 0);
				//$container.append($newContainer).masonry('appended',  $newContainer);
				
				$container.imagesLoaded(function(){
					$container.masonry('appended',  $newContainer);
				});
			},
			error : function(err){
				alert(err);
			}
		});
	}
	
	$(window).scroll(function() {
		
		if($(document).height() - window.innerHeight - $(document).scrollTop() < 10) {
			loadPoem();
		}
		
	});
	
	var createPoemDiv = function(poems){
		var $newContainer = $("<div></div>");
		$.each(poems,function(index,poem){
			var container = $(".container");
			var pDiv = $("<div class='poem'></div>");
			var pTitle = $("<span>"+poem.title+"</span><br/>");
			var pAuthor = $("<span>"+poem.author+"</span><br/>");
			var pContent = $("<span>"+formatPoem(poem.content)+"</span><br/>");
			pDiv.append(pTitle).append(pAuthor).append(pContent);
			
			$newContainer.append(pDiv);
		});
		
		
		return $newContainer;
	}
	
	var formatPoem = function(content){
		return content.replace(new RegExp(/(。)/g),"。<br/>");
	}

</script>
</head>
	<div class="container">
		<ul id="list"></ul>
		<!-- <div>
			<h3>静夜思</h1>
			<span>床前明月光,疑是地上霜。</span><br/>
			<span>举头望明月,低头思故乡。</span>
		</div> -->
	</div>
<body>
</body>
</html>
