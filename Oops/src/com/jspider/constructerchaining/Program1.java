package com.jspider.constructerchaining;


class City{
	City(){
		System.out.println("New York");
	}
	City(int a){
		this();
		System.out.println("London");
	}
	City(double b){
		this(10);
		System.out.println("Dubai");
	}
}

public class Program1 {

	public static void main(String[] args) {
		City c1 = new City(2.6);
	}

}
