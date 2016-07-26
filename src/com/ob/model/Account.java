package com.ob.model;

/**
 * Account entity. @author MyEclipse Persistence Tools
 */

public class Account implements java.io.Serializable {

	// Fields

	private Integer accountid;
	private Integer dealpassword;
	private Integer amount;
	private Integer term;
	private Integer isloss;
	private Integer cdlimit;
	private Integer integrate;
	private Integer isactive;
	private Integer isopenob;
	private Integer clientid;

	// Constructors

	/** default constructor */
	public Account() {
	}

	/** minimal constructor */
	public Account(Integer accountid, Integer dealpassword, Integer amount,
			Integer isloss, Integer cdlimit, Integer integrate, Integer isactive,
			Integer isopenob, Integer clientid) {
		this.accountid = accountid;
		this.dealpassword = dealpassword;
		this.amount = amount;
		this.isloss = isloss;
		this.cdlimit = cdlimit;
		this.integrate = integrate;
		this.isactive = isactive;
		this.isopenob = isopenob;
		this.clientid = clientid;
	}

	/** full constructor */
	public Account(Integer accountid, Integer dealpassword, Integer amount,
			Integer term, Integer isloss, Integer cdlimit, Integer integrate,
			Integer isactive, Integer isopenob, Integer clientid) {
		this.accountid = accountid;
		this.dealpassword = dealpassword;
		this.amount = amount;
		this.term = term;
		this.isloss = isloss;
		this.cdlimit = cdlimit;
		this.integrate = integrate;
		this.isactive = isactive;
		this.isopenob = isopenob;
		this.clientid = clientid;
	}

	// Property accessors

	public Integer getAccountid() {
		return this.accountid;
	}

	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}

	public Integer getDealpassword() {
		return this.dealpassword;
	}

	public void setDealpassword(Integer dealpassword) {
		this.dealpassword = dealpassword;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getTerm() {
		return this.term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	public Integer getIsloss() {
		return this.isloss;
	}

	public void setIsloss(Integer isloss) {
		this.isloss = isloss;
	}

	public Integer getCdlimit() {
		return cdlimit;
	}

	public void setCdlimit(Integer cdlimit) {
		this.cdlimit = cdlimit;
	}

	public Integer getIntegrate() {
		return this.integrate;
	}

	public void setIntegrate(Integer integrate) {
		this.integrate = integrate;
	}

	public Integer getIsactive() {
		return this.isactive;
	}

	public void setIsactive(Integer isactive) {
		this.isactive = isactive;
	}

	public Integer getIsopenob() {
		return this.isopenob;
	}

	public void setIsopenob(Integer isopenob) {
		this.isopenob = isopenob;
	}

	public Integer getClientid() {
		return this.clientid;
	}

	public void setClientid(Integer clientid) {
		this.clientid = clientid;
	}

	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", dealpassword="
				+ dealpassword + ", amount=" + amount + ", term=" + term
				+ ", isloss=" + isloss + ", cdlimit=" + cdlimit + ", integrate="
				+ integrate + ", isactive=" + isactive + ", isopenob="
				+ isopenob + ", clientid=" + clientid + "]";
	}
	
	
}