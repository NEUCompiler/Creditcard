package com.ob.model;

/**
 * Creditcard entity. @author MyEclipse Persistence Tools
 */

public class Creditcard implements java.io.Serializable {

	// Fields

	private Integer cid;
	private String spassword;
	private Integer cpassword;
	private Integer amount;
	private Integer integrate;
	private Boolean isloss;
	private Boolean isactive;

	// Constructors

	/** default constructor */
	public Creditcard() {
	}

	/** minimal constructor */
	public Creditcard(Integer cid) {
		this.cid = cid;
	}

	/** full constructor */
	public Creditcard(Integer cid, String spassword, Integer cpassword,
			Integer amount, Integer integrate, Boolean isloss, Boolean isactive) {
		this.cid = cid;
		this.spassword = spassword;
		this.cpassword = cpassword;
		this.amount = amount;
		this.integrate = integrate;
		this.isloss = isloss;
		this.isactive = isactive;
	}

	// Property accessors

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getSpassword() {
		return this.spassword;
	}

	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

	public Integer getCpassword() {
		return this.cpassword;
	}

	public void setCpassword(Integer cpassword) {
		this.cpassword = cpassword;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getIntegrate() {
		return this.integrate;
	}

	public void setIntegrate(Integer integrate) {
		this.integrate = integrate;
	}

	public Boolean getIsloss() {
		return this.isloss;
	}

	public void setIsloss(Boolean isloss) {
		this.isloss = isloss;
	}

	public Boolean getIsactive() {
		return this.isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Override
	public String toString() {
		return "Creditcard [cid=" + cid + ", spassword=" + spassword
				+ ", cpassword=" + cpassword + ", amount=" + amount
				+ ", integrate=" + integrate + ", isloss=" + isloss
				+ ", isactive=" + isactive + "]";
	}

	
}