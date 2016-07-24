package com.ob.action;

import com.ob.dao.CreditcardDAO;
import com.ob.dao.impl.CredicardDAOImpl;
import com.ob.model.Creditcard;
import com.ob.service.CredicardService;
import com.opensymphony.xwork2.ModelDriven;

public class Credicard_lossAction extends SuperAction implements ModelDriven<Creditcard>{
	
	private Creditcard creditcard;
	private CredicardService credicardService;
	
	public void setCredicardService(CredicardService credicardService) {
		this.credicardService = credicardService;
	}
	
	/**
	 * @return the credicardService
	 */
	public CredicardService getCredicardService() {
		return credicardService;
	}

	public String loss() {
		creditcard.setCid(123);
		System.out.println(creditcard);
		request.setAttribute("creditcard",creditcard);
		System.out.println(credicardService.findById(123456));
		request.setAttribute("a", 12345);
		return SUCCESS;
	}
	
	 @Override
    public Creditcard getModel() {

       if(creditcard == null){
    	   creditcard = new Creditcard();
       }
       return creditcard;
    }
}
