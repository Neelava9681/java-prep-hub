package com.jspider.encapsulation;

public class Create {

	public static void main(String[] args) {
		Credentials cc = new Credentials();
		
		cc.setUserName("Neelava123");
		cc.setPass("Neelava@123");
		System.out.println(cc.getUserName());
		System.out.println(cc.getPass());

	}

}
