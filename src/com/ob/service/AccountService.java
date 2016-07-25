package com.ob.service;

import java.util.ArrayList;

import com.ob.dao.AccountDAO;
import com.ob.model.Account;

public interface AccountService {
	public boolean isLoss(Account account);
	public boolean setLoss(Account account);
	public boolean isActive(Account account);
	public boolean setActive(Account account);
	
	
	public ArrayList<Integer> getCdsOfClient(Account account);
}
