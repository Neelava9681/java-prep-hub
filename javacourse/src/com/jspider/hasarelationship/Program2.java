package com.jspider.hasarelationship;

class Engine{
	void power() {
		System.out.println("Engine has power");
	}
}

class Driver{
	void drive() {
		System.out.println("driver is driving");
	}
}

class Car{
	Driver d1=new Driver();
	Engine e1=new Engine();
}

public class Program2 {

	public static void main(String[] args) {
		Car c1=new Car();
		
		c1.d1.drive();
		c1.e1.power();

	}

}
