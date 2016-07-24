package com.ob.service;

import com.ob.dao.AccountDAO;
import com.ob.model.Account;

public interface AccountService {
	
	public Account findById(java.lang.Integer id);
}
