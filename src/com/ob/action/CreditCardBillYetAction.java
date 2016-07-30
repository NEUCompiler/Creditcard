package com.ob.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.ob.model.Account;
import com.ob.model.Client;
import com.ob.model.Dealinform;
import com.ob.service.AccountService;
import com.opensymphony.xwork2.ModelDriven;

public class CreditCardBillYetAction extends SuperAction implements
		ModelDriven<Account> {

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
	 * 选择卡。
	 * 
	 * @return
	 */
	public String selectCard() {
		session.setAttribute("creditcard", request.getParameter("selectCd"));
		return "selectOkBillYet";
	}
	
	/**
	 * 显示信用卡。
	 * 
	 * @return
	 */
	public String showCreditCard() {
		account.setClientid(1);
		session.setAttribute("clientId", 1);
		request.setAttribute("accountIdList",
				accountService.getCdsOfClientByActive(account));
		return "showCreditCardBillYet";
	}
	
	/**
	 * 密码确认。
	 * 
	 * @return
	 */
	public String confirmPassword() {
		account.setAccountid(session.getAttribute("creditcard").toString());
		account.setSearchpassword(request.getParameter("searchPassword"));
//		client.setClientid(Integer.parseInt(session.getAttribute("clientId")
//				.toString()));

		if (!accountService.confirmCDSearchPassword(account)) {
			return "confirmFailedBillYet";
		}
		ArrayList<Dealinform> dealInfoList = new ArrayList<Dealinform>();
		
		dealInfoList = (ArrayList<Dealinform>) accountService.getDealinformDAO().findByAccountid(account.getAccountid());
		
		request.setAttribute("dealInfoList", dealInfoList);
		
		return "confirmSuccessBillYet";
	}
	
	
	
	@Override
	public Account getModel() {

		if (account == null) {
			account = new Account();
		}
		return account;
	}
}
