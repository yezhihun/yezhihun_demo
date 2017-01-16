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
<%--<link href="${app}/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link href="${app}/dist/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">--%>

<link href="${app}/css/style.css" rel="stylesheet" type="text/css">

<script src="${app}/dist/jquery/jquery.min.js"></script>
<script src="${app}/dist/jquery/masonry.pkgd.min.js"></script>
<script src="${app}/dist/jquery/masonry-docs.min.js"></script>

<script src="${app}/dist/js/bootstrap.min.js"></script>

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
				
				var $newContainer = createPoemDiv(data.list);
				$container.append($newContainer).masonry('appended', $newContainer, true);
				$container.imagesLoaded( function(){
					$container.masonry();
				});
			},
			error : function(err){
				alert(err);
			}
		});
	}
	
	$(window).scroll(function() {
		
		if($(document).height() - window.innerHeight - $(document).scrollTop() < 10) {
			appendPoem();
		}
		
	});
	
	var createPoemDiv = function(poems){
		var $newContainer = $("<ul class='clearfix'></ul>");
		
		$.each(poems,function(index,poem){
			var container = $(".container");
			var pDiv = $("<li class='poem'></li>");
			var pImg = $('<div class="main-img"><img src="imgs/1.jpg" /></div>');
			var pTitle = $("<div class='title-first'>"+poem.title+"</div><br/>");
			var pAuthor = $("<div class='title-second'>"+poem.author+"</div><br/>");
			var pContent = $("<div class='text'>"+formatPoem(poem.content)+"</div><br/>");
			pDiv.append(pImg).append(pTitle).append(pAuthor).append(pContent);
			
			$newContainer.append(pDiv);
		});
		
		
		return $newContainer;
	}
	
	var formatPoem = function(content){
		return content.replace(new RegExp(/(。)/g),"。<br/>");
	}

</script>
</head>
	<div class="container main">
		<ul id="list clearfix"></ul>
	</div>
<body>
</body>
</html>
