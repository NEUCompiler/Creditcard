package com.ob.action;

import com.ob.model.Account;
import com.ob.model.Client;
import com.ob.service.AccountService;
import com.opensymphony.xwork2.ModelDriven;

public class CreditcardActiveAction extends SuperAction implements
			ModelDriven<Account> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Account account;
	private Client client = new Client();
	private AccountService accountService;

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	/**
	 * ���ÿ����
	 */
	public void active() {
		account.setAccountid(Integer.parseInt(session.getAttribute("creditcard").toString()));
		accountService.setActive(account);
	}
	
	/**
	 * ��ʾ���ÿ���
	 * @return
	 */
	public String showCreditCard() {
		account.setClientid(1);
		session.setAttribute("clientId", 1);
		request.setAttribute("accountIdList", accountService.getCdsOfClientByActive(account));
		return "showCreditCardActive";
	}
	
	/**
	 * ѡ�񿨡�
	 * @return
	 */
	public String selectCard() {
		session.setAttribute("creditcard", request.getParameter("selectCd"));
		session.setAttribute("cdLimit", request.getParameter("cdLimit"));
		return "selectOkActive";
	}
	
	/**
	 * ����ȷ�ϡ�
	 * @return
	 */
	public String confirmPassword() {
		client.setUserpassword(request.getParameter("accountPassword"));
		client.setClientid(Integer.parseInt(session.getAttribute("clientId").toString()));
			
		if (!accountService.confirmSearchPassword(client)) {
			return "confirmFailedActive";
		}
		
		active();
		return "confirmSuccessActive";
	}
	
	@Override
	public Account getModel() {
		if (account == null) {
			account = new Account();
		}
		return account;
	}
}
