package com.ob.action;

import com.ob.model.Account;
import com.ob.service.AccountService;
import com.opensymphony.xwork2.ModelDriven;

public class CreditcardLimitSearchAction extends SuperAction implements
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
	 * 额度查询。
	 * @return
	 */
	public String search() {
		account.setAccountid(request.getParameter("selectCd").toString());
		request.setAttribute("cdLimit", accountService.getLimit(account));
		
		return "selectOkLimit";
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
		return "showCreditCardSearchLimit";
	}
	
	/**
	 * 选择卡。
	 * @return
	 */
	public String selectCard() {
		session.setAttribute("creditcard", request.getParameter("selectCd"));
		
		return search();
	}
	
	@Override
	public Account getModel() {
		if (account == null) {
			account = new Account();
		}
		return account;
	}
}
