package com.ob.service.impl;

import com.ob.dao.CreditcardDAO;
import com.ob.dao.impl.CredicardDAOImpl;
import com.ob.model.Creditcard;
import com.ob.service.CredicardService;

public class CredicardServiceImpl implements CredicardService {
	private CreditcardDAO dao;
	
	public void setDao(CreditcardDAO dao) {
		this.dao = dao;
	}

	public Creditcard findById(java.lang.Integer id) {
		return dao.findById(id);
	}
}
