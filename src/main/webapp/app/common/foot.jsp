<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	request.setAttribute("app",request.getContextPath());
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>东方银谷月还系统</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<script src="${app}/js/jquery-1.8.0.min.js" charset="UTF-8" type="text/javascript"></script>
		<script type="text/javascript" charset="utf-8">
			$(function(){
				$("#btn").bind("click",function(){
					//window.open("${app}/person/showPersonList");
					$.ajax({
						url : "http://10.0.130.39:8010/Operation.svc/PushMonthlyRepayData",
						type : "post",
						crossDomain: true,
						success : function(data){
							alert(data);
						}
					});
				});
			});
		</script>
	</head>

	<body class="easyui-layout" style="width: 100%; height: 100%;">
		<button id="btn">test</button>
	</body>
</html>
