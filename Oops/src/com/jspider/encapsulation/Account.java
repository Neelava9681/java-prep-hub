package com.jspider.encapsulation;

import java.io.Serializable;

public class Account implements Serializable{
	
	private long accountNumber;
	private long accountBalance;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}

}
