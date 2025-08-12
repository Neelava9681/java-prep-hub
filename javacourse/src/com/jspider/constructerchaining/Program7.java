package com.jspider.constructerchaining;


class A {
	A(){
		System.out.println("A() is excetuing");
	}
}

class B extends A{
	B(){
		super();
		System.out.println("B() is excetuing");
	}
}

public class Program7 {

	public static void main(String[] args) {
		B ref = new B();
		

	}

}
