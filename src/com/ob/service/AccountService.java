package com.ob.service;

import java.util.ArrayList;

import com.ob.dao.AccountDAO;
import com.ob.model.Account;
import com.ob.model.Client;

public interface AccountService {
	public boolean isLoss(Account account);
	public boolean setLoss(Account account);
	
	public boolean isActive(Account account);
	public boolean setActive(Account account);

	public ArrayList<Integer> getCdsOfClient(Account account);
	public boolean confirmSearchPassword(Client client);
	public Integer getIntegration(Account account);
	public Integer getLimit(Account account);
	public boolean setLimit(Account account);
}
