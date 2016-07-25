package com.ob.action;


import com.ob.model.Account;
import com.ob.service.AccountService;
import com.opensymphony.xwork2.ModelDriven;

public class CreditcardAction extends SuperAction implements ModelDriven<Account>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Account account;
	private AccountService accountService;
	
	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	/**
	 * 信用卡挂失设置。
	 * @return
	 */
	public String setLoss() {
		
		account.setAccountid(123);
		
		if (accountService.isLoss(account)) {
			return "lossFaild";
		} 
		
		accountService.setLoss(account);
		return "lossSuccess";
	}
	
	/**
	 * 信用卡激活。
	 * @return
	 */
	public String setActive() {
		System.out.println("1");
		account.setAccountid(123);
		
		if (accountService.isActive(account)) {
			return "lossFaild";
		} 
		
		accountService.setActive(account);
		return "lossSuccess";
	}
	
	/**
	 * 信用卡查询密码设置。
	 * @return
	 */
	public String setSearchPassword() {
		return SUCCESS;
	}
	
	/**
	 * 信用卡交易密码设置
	 * @return
	 */
	public String setDealPassword() {
		return SUCCESS;
	}
	
	/**
	 * 信用卡额度设置。
	 * @return
	 */
	public String setLimit() {
		return SUCCESS;
	}
	
	/**
	 * 信用额度查询。
	 * @return
	 */
	public String searchLimit() {
		return SUCCESS;
	}
	
	/**
	 * 已出账单查询。
	 * @return
	 */
	public String searchHaveBill() {
		return SUCCESS;
	}
	
	/**
	 * 未出账单查询。
	 * @return
	 */
	public String searchYetBill() {
		return SUCCESS;
	}
	
	/**
	 * 积分查询。
	 * @return
	 */
	public String searchIntegratel() {
		return SUCCESS;
	}
	
	/**
	 * 申请进度查询。
	 * @return
	 */
	public String searchIntegratel1() {
		//TODO
		return SUCCESS;
	}
 
	public String showCreditCard() {
		account.setClientid(1);
		request.setAttribute("accountIdList", accountService.getCdsOfClient(account));
		return "showCreditCard";
	}
	
	
	
	 @Override
    public Account getModel() {

       if(account == null){
    	   account = new Account();
       }
       return account;
    }
}
