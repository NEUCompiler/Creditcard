<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>My JSP 'showCreditCard.jsp' starting page</title>
</head>

<body>

	<form action="CredicardLimitSet_selectCard.action">

		<select name="selectCd">
			<c:forEach items="${request.accountIdList}" var="li">

				<option value=${li}>${li}</option>

			</c:forEach>
		</select>
		<br/>
		请输入你要修改的金额：<input type="text" name="cdLimit"/>
		<button>下一步</button>
	</form>
	<button onclick="location.href('index.jsp')">上一步</button>

</body>
</html>
