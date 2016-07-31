<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/bootstrap.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>信用卡可用额度查询</title>
</head>

<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<ul class="breadcrumb">
					<li><a href="#">信用卡可用额度查询</a></li>
					<li class="active">选择查询的信用卡</li>
					<li><a href="#">确认查询密码</a></li>
					<li><a href="#">可用额度查询成功</a></li>
				</ul>
				<form action="CreditcardLimitSearch_selectCard.action" id="form">
					请选择你所要查询额度的信用卡: <select name="selectCd" class="form-control">
						<c:forEach items="${request.accountIdList}" var="li">
							<option>${li}</option>
						</c:forEach>
					</select>
				</form>
				<a class="btn btn-default" href="index.jsp" role="button">上一步</a> <input
					type="button" class="btn btn-default" value="下一步"
					onclick="document.getElementById('form').submit();" />
			</div>
		</div>
	</div>
</body>
</html>
