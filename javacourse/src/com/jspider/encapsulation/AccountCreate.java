package com.jspider.encapsulation;

public class AccountCreate {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setAccountNumber(350003436812L);
		a1.setAccountBalance(50000L);
		
		System.out.println(a1.getAccountNumber());
		System.out.println(a1.getAccountBalance());
		
		

	}

}
