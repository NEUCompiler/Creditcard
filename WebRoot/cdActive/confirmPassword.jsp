<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/bootstrap.jsp"%>
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
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<!-- 主页  -->
			</div>
		</div>
		<div class="row clearfix">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<ul class="breadcrumb">
						<li><a href="#">信用卡激活</a></li>
						<li><a href="CreditcardActive_showCreditCard.action">选择未激活的信用卡</a></li>
						<li class="active">确认网银密码</li>
						<li><a href="#">激活成功</a></li>
					</ul>
				</div>
			</div>
			<div class="col-md-12 column">
				<form class="form-horizontal" role="form"
					action=CreditcardActive_confirmPassword.action>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">请输入网银密码:</label>
						<div class="col-sm-10">
							<input class="form-control" id="accountPassword" type="password"
								name="accountPassword" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">确认</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
