package com.jspider.trainner;
import java.util.Scanner;

public class Boss {
	
	static void show(Trainner t) {
		System.out.println("Tainner id is: "+t.trainnerId);
		System.out.println("Tainner salary is: "+t.sal);
		System.out.println("Avaibility: "+t.avability);
		
	}
	
	static Trainner addTrainner() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the trainner id: ");
		int id =sc.nextInt();
		System.out.println("Enter the Salary of this trainner: ");
		double sal = sc.nextDouble();
		System.out.println("Enter the avalibity in true or false: ");
		boolean avaibility=sc.nextBoolean();
		
		Trainner t = new Trainner(id,sal,avaibility);
		return t;
	}

}
