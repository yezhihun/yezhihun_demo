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

<script src="${app}/vendor/jquery/jquery.min.js"></script>

<script type="text/javascript">
	$(function() {
		var _url = "${app}/articleController/showArticleList";
		$.ajax({
			url: _url,
			type : "post",
			dataType : "josn",
			success : function(data){
				var ul = $("#list");
				$.each(data,function(index,val){
					var li = $("<li id='article_"+val.id+"'></li>");
					li.append(val.title);
					ul.append(li);
				});
			}
		});
	});

</script>
</head>
	<ul id="list">
	
	</ul>
<body>
</body>
</html>
