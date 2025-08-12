package com.jspider.polymorphism;
class Flipkart{
	void pay() {
		System.out.println("cod");
	}
	void pay(int card) {
		System.out.println("card");
	}
	void pay(double upi) {
		System.out.println("upi");
	}
	void pay(String netbanking) {
		System.out.println("net banking");
	}
}


public class Program {

	public static void main(String[] args) {
		Flipkart obj=new Flipkart();
		obj.pay();
		obj.pay(12);
		obj.pay(2.345);
		obj.pay("Neelava");
		
	}

}
