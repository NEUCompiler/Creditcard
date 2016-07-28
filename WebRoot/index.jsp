<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="bootstrap.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
  </head>
  
  <body>
  
  <div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="btn-group">
				 <button class="btn btn-default">信用卡</button> <button data-toggle="dropdown" class="btn btn-default dropdown-toggle"><span class="caret"></span></button>
				<ul class="dropdown-menu">
					<li>
						 <a href="CreditcardLoss_showCreditCard.action">信用卡挂失</a>
					</li>
					<li>
						 <a href="CreditcardActive_showCreditCard.action">信用卡激活</a>
					</li>
					<li class="disabled">
						 <a href="credicard_setSearchPassword.action">信用卡查询密码设置</a>
					</li>
					<li>
						 <a href="CredicardDealPasswordSet_showCreditCard.action">信用卡交易密码设置</a>
					</li>
					<li>
						 <a href="CredicardLimitSet_showCreditCard.action">信用卡额度设置</a>
					</li>
					<li>
						 <a href="CredicardLimitSearch_showCreditCard.action">信用额度查询</a>
					</li>
					<li class="disabled">
						 <a href="credicard_searchHaveBill.action">已出账单查询</a>
					</li>
					<li class="disabled">
						 <a href="credicard_searchYetBill.action">未出账单查询</a>
					</li>
					<li>
						 <a href="CreditcardIntegration_showCreditCard.action">积分查询</a>
					</li>
					<li class="disabled">
						 <a href="credicard_searchIntegratel.action">申请进度查询</a>
					</li>
				</ul>
			</div>
		</div>
	</div>
</div>
     
     <!--
    <a href="CreditcardLoss_showCreditCard.action">信用卡挂失</a></br>
    <a href="CreditcardActive_showCreditCard.action">信用卡激活</a></br>
    <a href="credicard_setSearchPassword.action">信用卡查询密码设置</a></br>
    <a href="CredicardDealPasswordSet_showCreditCard.action">信用卡交易密码设置</a></br>
    <a href="CredicardLimitSet_showCreditCard.action">信用卡额度设置</a></br>
    <a href="CredicardLimitSearch_showCreditCard.action">信用额度查询</a></br>
	<a href="credicard_searchHaveBill.action">已出账单查询</a></br>
	<a href="credicard_searchYetBill.action">未出账单查询</a></br>
	<a href="CreditcardIntegration_showCreditCard.action">积分查询</a></br>
	<a href="credicard_searchIntegratel.action">申请进度查询</a></br>
	</br></br></br></br></br>
      -->
  </body>
</html>
