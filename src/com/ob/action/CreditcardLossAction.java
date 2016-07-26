package com.ob.action;


import com.ob.model.Account;
import com.ob.model.Client;
import com.ob.service.AccountService;
import com.opensymphony.xwork2.ModelDriven;

public class CreditcardLossAction extends SuperAction implements ModelDriven<Account> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Account account;
	private Client client = new Client();
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
		account.setAccountid(Integer.parseInt(session.getAttribute("creditcard").toString()));
		
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
		account.setAccountid(Integer.parseInt(session.getAttribute("creditcard").toString()));
		
		if (accountService.isActive(account)) {
			return "activeFaild";
		} 
		
		accountService.setActive(account);
		return "activeSuccess";
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
	 * 申请进度查询。
	 * @return
	 */
	public String searchIntegratel1() {
		//TODO
		return SUCCESS;
	}
 
	/**
	 * 显示信用卡。
	 * @return
	 */
	public String showCreditCard() {
		account.setClientid(1);
		session.setAttribute("clientId", 1);
		request.setAttribute("accountIdList", accountService.getCdsOfClient(account));
		return "showCreditCard";
	}
	
	/**
	 * 密码确认。
	 * @return
	 */
	public String confirmPassword() {
		client.setUserpassword(request.getParameter("accountPassword"));
		client.setClientid(Integer.parseInt(session.getAttribute("clientId").toString()));
			
		if (!accountService.confirmSearchPassword(client)) {
			return "confirmFailed";
		}
		
		return "confirmSuccess";
	}
	
	/**
	 * 选择卡。
	 * @return
	 */
	public String selectCard() {
		session.setAttribute("creditcard", request.getParameter("selectCd"));
		return "selectOk";
	}
	
	 @Override
    public Account getModel() {

       if(account == null){
    	   account = new Account();
       }
       return account;
    }
}
