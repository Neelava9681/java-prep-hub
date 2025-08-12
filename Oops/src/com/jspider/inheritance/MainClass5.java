package com.jspider.inheritance;

class SwiggyOld{
	void orderFood() {
		System.out.println("we can order food from it");
	}
}

class SwiggyNew extends SwiggyOld{
	void orderGroceries() {
		System.out.println("Now we can also orders the grocery items");
	}
}



public class MainClass5 {

	public static void main(String[] args) {
		SwiggyNew sw=new SwiggyNew();
		sw.orderFood();
		sw.orderGroceries();
	}

}
