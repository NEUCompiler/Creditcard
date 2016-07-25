package com.ob.service.impl;

import java.util.ArrayList;

import antlr.collections.List;

import com.ob.dao.AccountDAO;
import com.ob.model. Account;
import com.ob.service. AccountService;

public class AccountServiceImpl implements  AccountService {
	private AccountDAO dao;
	
	public void setDao(AccountDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean isLoss(Account account) {
		account = dao.findById(account.getAccountid());
		
		System.out.println(account);
		
		if (account.getIsloss() == 0) {
			return false;
		}
		return true;
	}

	@Override
	public boolean setLoss(Account account) {
		account = dao.findById(account.getAccountid());
		account.setIsloss(1);
		//TODO merge有问题。
		dao.merge(account);
		System.out.println(account);
		return true;
	}

	@Override
	public boolean isActive(Account account) {
		account = dao.findById(account.getAccountid());
		
		System.out.println(account);
		
		if (account.getIsactive() == 0) {
			return false;
		}
		return true;
	}

	@Override
	public boolean setActive(Account account) {
		account = dao.findById(account.getAccountid());
		account.setIsactive(1);
		//TODO merge有问题。
		dao.merge(account);
		System.out.println(account);
		return true;
	}

	@Override
	public ArrayList<Integer> getCdsOfClient(Account account) {
		ArrayList<Integer> accountIdList = new ArrayList<Integer>();
		ArrayList<Account> accounts = (ArrayList<Account>)dao.findByClientid(account.getClientid());
		
		for (Account item : accounts) {
			accountIdList.add(item.getAccountid());
		}
		
		return accountIdList;
	}
	
	
	
}
