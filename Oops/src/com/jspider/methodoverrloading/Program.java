package com.jspider.methodoverrloading;

class Father {
	void bike() {
		System.out.println("The bike is fully stocked");
	}
}

class Child extends Father{
	@Override
	void bike() {
		System.out.println("The bike is modified");
	}
}



public class Program {

	public static void main(String[] args) {
		Father fc =  new Father();
		fc.bike();
		Child ch = new Child();
		ch.bike();
		
		Father f1=new Child();
		f1.bike();

	}

}
