package com.ob.action;

import com.ob.dao.impl.AccountDAOImpl;
import com.ob.model.Account;
import com.ob.service.AccountService;
import com.opensymphony.xwork2.ModelDriven;

public class Credicard_lossAction extends SuperAction implements ModelDriven<Account>{
	
	private Account account;
	private AccountService accountService;
	
	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	public String loss() {
		account.setAccountid(123);
		System.out.println(account);
		request.setAttribute("creditcard",account);
		System.out.println(accountService.findById(123));
		request.setAttribute("a", 12345);
		return SUCCESS;
	}
	
	 @Override
    public Account getModel() {

       if(account == null){
    	   account = new Account();
       }
       return account;
    }
}
