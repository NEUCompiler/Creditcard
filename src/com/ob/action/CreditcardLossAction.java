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
	 * ���ÿ���ʧ���á�
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
	 * ���ÿ����
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
	 * ������Ȳ�ѯ��
	 * @return
	 */
	public String searchIntegratel1() {
		//TODO
		return SUCCESS;
	}
 
	/**
	 * ��ʾ���ÿ���
	 * @return
	 */
	public String showCreditCard() {
		account.setClientid(1);
		session.setAttribute("clientId", 1);
		request.setAttribute("accountIdList", accountService.getCdsOfClient(account));
		return "showCreditCard";
	}
	
	/**
	 * ����ȷ�ϡ�
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
	 * ѡ�񿨡�
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
