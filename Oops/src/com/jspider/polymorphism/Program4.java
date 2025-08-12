package com.jspider.polymorphism;

class Card{
	void swipe() {
		
	}
}

class DebitCard extends Card{
	@Override
	void swipe() {
		System.out.println("the balance reduced");
	}
}

class CraditCard extends Card{
	@Override
	void swipe() {
		System.out.println("the balance deu");
	}
}




public class Program4 {

	public static void main(String[] args) {
		Card c;
		c=new DebitCard();
		c.swipe();
		c=new CraditCard();
		c.swipe();

	}

}
