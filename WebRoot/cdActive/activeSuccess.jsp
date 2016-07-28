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
						<li><a href="#">选择未激活的信用卡</a></li>
						<li><a href="#">确认网银密码</a></li>
						<li class="active">激活成功</li>
					</ul>
				</div>
			</div>
			<div class="col-md-12 column">
				<p>
					信用卡:${sessionScope.creditcard}激活成功。
				</p>
			</div>
		</div>
	</div>
</body>
</html>
