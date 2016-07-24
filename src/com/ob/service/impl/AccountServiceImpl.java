package com.ob.service.impl;

import com.ob.dao.AccountDAO;
import com.ob.model. Account;
import com.ob.service. AccountService;

public class AccountServiceImpl implements  AccountService {
	private AccountDAO dao;
	
	public void setDao(AccountDAO dao) {
		this.dao = dao;
	}

	public Account findById(java.lang.Integer id) {
		return dao.findById(id);
	}
}
