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
	 * ���ÿ���ʧ���á�
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
	 * ���ÿ����
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
	 * ���ÿ���ѯ�������á�
	 * @return
	 */
	public String setSearchPassword() {
		return SUCCESS;
	}
	
	/**
	 * ���ÿ�������������
	 * @return
	 */
	public String setDealPassword() {
		return SUCCESS;
	}
	
	/**
	 * ���ÿ�������á�
	 * @return
	 */
	public String setLimit() {
		return SUCCESS;
	}
	
	/**
	 * ���ö�Ȳ�ѯ��
	 * @return
	 */
	public String searchLimit() {
		return SUCCESS;
	}
	
	/**
	 * �ѳ��˵���ѯ��
	 * @return
	 */
	public String searchHaveBill() {
		return SUCCESS;
	}
	
	/**
	 * δ���˵���ѯ��
	 * @return
	 */
	public String searchYetBill() {
		return SUCCESS;
	}
	
	/**
	 * ���ֲ�ѯ��
	 * @return
	 */
	public String searchIntegratel() {
		return SUCCESS;
	}
	
	/**
	 * ������Ȳ�ѯ��
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
