package com.jspider.learning;

class Employee{
	Employee(double ctc){
		System.out.println("software Developer");
	}
	Employee(double ctc, double bonus){
		System.out.println("Team Lead");
	}
	Employee(double ctc, double bonus, double insentive){
		System.out.println("Manager");
	}
}


public class MainEmployee {

	public static void main(String[] args) {
		Employee e1 =new Employee(5.1);
		Employee e2 =new Employee(8.5, 2.5);
		Employee e3 =new Employee(12.5, 4.6, 2.5);
		
	}

}
