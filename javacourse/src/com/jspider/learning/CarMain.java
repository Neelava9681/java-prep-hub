package com.jspider.learning;
class Car{
	Car(int a){
		System.out.println("Petro varient car");
		
		System.out.println(a);
	}
	Car(double d){
		System.out.println("Deisel varient car");
	}
	Car(String s){
		System.out.println("Electrict varient car");
	}
	
}

public class CarMain {
	public static void main(String[] args) {
		Car c1 = new Car(10);
		Car c2 = new Car(4.4);
		Car c3 = new Car("ABC");
//		System.out.println(c1.a);
	}
}
