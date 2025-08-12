package com.jspider.hasarelationship;

import javax.security.auth.login.AccountException;

class Account{
	void withdraw() {
		System.out.println("money is coming");
	}
}

class Customer{
	Account a=new Account();
}
class Bank{
	Customer c=new Customer(); 
}

public class Program4 {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.c.a.withdraw();

	}

}
