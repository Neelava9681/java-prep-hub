package com.jspider.CustomException;


class InsufficientBalanceException extends Exception{
	@Override
	public void printStackTrace() {
		System.out.println("Insufficient balance");
	}
}

class Atm{
	private int balance;
	Atm(int balance) {
		this.balance=balance;
	}
	
	public void withdwral(int amount) throws InsufficientBalanceException {
		if(this.balance<amount) {
			throw new InsufficientBalanceException();
		}
		else {
			this.balance-=amount;
			System.out.println("Done----Available balance is: "+this.balance);
		}
		System.out.flush();
	}
}

public class Program1 {

	public static void main(String[] args) {
		Atm user1=new Atm(2000);
//		Atm user2=new Atm(2500);
		try {
			user1.withdwral(1500);
			user1.withdwral(200);
			user1.withdwral(800);
			} catch (InsufficientBalanceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
