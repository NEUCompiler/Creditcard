<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>填写激活信息</title>

</head>

<body>

	<form action=CredicardLimitSet_confirmPassword.action>
		请输入密码:<input type="password" name="accountPassword" type="text"></br>
		<input type="submit" value="确认"/>
	</form>
</body>
</html>
