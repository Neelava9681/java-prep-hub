package com.jspider.constructerchaining;

class Meals{
	Meals(){
		this(10);
		System.out.println("North Indian Meals");
	}
	
	Meals(int a){
		this(2.5);
		System.out.println("South Indian Meals");
	}
	Meals(double b){
		System.out.println("Bengali Food");
	}
	
}

public class Program2 {

	public static void main(String[] args) {
		Meals m1 = new Meals();
		

	}

}
