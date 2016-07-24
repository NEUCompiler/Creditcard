<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
     
    <a href="credicardLoss.action">信用卡挂失</a></br>
    <a href="credicardActive.action">信用卡激活</a></br>
    <a href="credicardSearchPassword_set.action">信用卡查询密码设置</a></br>
    <a href="credicardDealPassword_set.action">信用卡交易密码设置</a></br>
    <a href="credicardLimit_set.action">信用卡额度设置</a></br>
    <a href="credicardLimit_search.action">信用额度查询</a></br>
	<a href="credicardHaveBill_search.action">已出账单查询</a></br>
	<a href="credicardYetBill_search.action">未出账单查询</a></br>
	<a href="credicardIntegratel_search.action">积分查询</a></br>
	<a href="credicardIntegratel_search.action">申请进度查询</a></br>
	    
  </body>
</html>
