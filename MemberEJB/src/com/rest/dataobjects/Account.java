package com.rest.dataobjects;

public class Account {
	private String acctNum;
	private String acctNickName;
	private String acctHolderName;

	public String getAccountNumber() {
		return acctNum;
	}

	public Account(String acctNum, String acctNickName, String acctHolderName) {
		super();
		this.acctNum = acctNum;
		this.acctNickName = acctNickName;
		this.acctHolderName = acctHolderName;
	}

	public void setAccountNumber(String acctNum) {
		this.acctNum = acctNum;
	}

	public String getAcctNum() {
		return acctNum;
	}

	public void setAcctNum(String acctNum) {
		this.acctNum = acctNum;
	}

	public String getAcctNickName() {
		return acctNickName;
	}

	public void setAcctNickName(String acctNickName) {
		this.acctNickName = acctNickName;
	}

	public String getAcctHolderName() {
		return acctHolderName;
	}

	public void setAcctHolderName(String acctHolderName) {
		this.acctHolderName = acctHolderName;
	}
}