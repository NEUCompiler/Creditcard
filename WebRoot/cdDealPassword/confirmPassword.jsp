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

	<form action=CredicardDealPasswordSet_setPassword.action>
		请输入你当前的交易密码：<input type="password" name="dealpassword" type="text"></br>
		请输入要设的密码:<input type="password" name="chPassword" type="text"></br>
		请确认要设的密码:<input type="password" name="confirmPassword" type="text"></br>
		<input type="submit" value="确认"/>
		</br>${request.info}
	</form>
</body>
</html>
