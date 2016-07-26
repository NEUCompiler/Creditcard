package com.ob.service.impl;

import java.util.ArrayList;

import antlr.collections.List;

import com.ob.dao.AccountDAO;
import com.ob.dao.ClientDAO;
import com.ob.model. Account;
import com.ob.model.Client;
import com.ob.service. AccountService;
import com.ob.service.ClientService;

public class AccountServiceImpl implements  AccountService {
	private AccountDAO dao;
	private ClientDAO clientDAO;

	public void setDao(AccountDAO dao) {
		this.dao = dao;
	}

	public void setClientDAO(ClientDAO clientDAO) {
		this.clientDAO = clientDAO;
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
			
			if (item.getIsactive() == 0) {
				accountIdList.add(item.getAccountid());
			}
		}
		
		return accountIdList;
	}
	
	/**
	 * 确认查询密码。
	 */
	@Override
	public boolean confirmSearchPassword(Client client) {
		if (client.getUserpassword().equals(clientDAO.findById(client.getClientid()).getUserpassword().toString())) {
			return true;
		}
		
		return false;
	}

	/**
	 * 查询积分。
	 */
	@Override
	public Integer getIntegration(Account account) {
		return dao.findById(account.getAccountid()).getIntegrate();
	}

	/**
	 * 可用额度查询。
	 */
	@Override
	public Integer getLimit(Account account) {
		return dao.findById(account.getAccountid()).getCdlimit();
	}

	/**
	 * 可用额度设置。
	 */
	@Override
	public boolean setLimit(Account account) {
		Integer limit = account.getCdlimit();
		account = dao.findById(account.getAccountid());
		account.setCdlimit(limit);
		System.out.println(account);
		dao.merge(account);
		return true;
	}
	
	
}
