package com.ob.action;

import javax.jms.Session;

import org.apache.commons.validator.Var;

import com.ob.model.Account;
import com.ob.service.AccountService;
import com.opensymphony.xwork2.ModelDriven;

public class CredicardDealPasswordSetAction extends SuperAction implements
			ModelDriven<Account> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Account account;
	private AccountService accountService;

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	
	/**
	 * 交易密码设置。
	 * @return
	 */
	public String setPassword() { 
		account.setAccountid(Integer.parseInt(session.getAttribute("creditcard").toString()));
		String chPassword = request.getParameter("chPassword");
		String confirmPassword = request.getParameter("confirmPassword");
		
		if (!account.getDealpassword().equals(accountService.getDao().findById(account.getAccountid()).getDealpassword())) {
			request.setAttribute("info", "当前密码输入不正确");
		} else if (!chPassword.equals(confirmPassword)) {
			request.setAttribute("info", "两次密码不一致，请重新输入！");
			
		} else if(!chPassword.matches("^[0-9]{6}$")) {
			request.setAttribute("info", "密码请输入6个数字");
		} else {
			account.setDealpassword(Integer.parseInt((chPassword)));
			accountService.setDealPassword(account);
			return "dealPasswordSetSuccess";
		}
		return "dealPasswordSetFailed";
	}
	
	/**
	 * 显示信用卡。
	 * @return
	 */
	public String showCreditCard() {
		account.setClientid(1);
		session.setAttribute("clientId", 1);
		//
		request.setAttribute("accountIdList", accountService.getCdsOfClient(account));
		return "showCreditCardDealPasswordSet";
	}
	
	/**
	 * 选择卡。
	 * @return
	 */
	public String selectCard() {
		session.setAttribute("creditcard", request.getParameter("selectCd"));
		
		return "selectOkDealPassword";
	}
	
	@Override
	public Account getModel() {
		if (account == null) {
			account = new Account();
		}
		return account;
	}
}
