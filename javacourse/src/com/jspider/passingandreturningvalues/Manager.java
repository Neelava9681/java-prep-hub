package com.jspider.passingandreturningvalues;
import java.util.Scanner;

public class Manager {
	static void disp(Employee e) {
		System.out.println("Id: "+e.id);
		System.out.println("ctc: "+e.ctc);
	}
	
	static Employee createEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter teh Employee id");
		int id=sc.nextInt();
		
		
		System.out.println("Eneter teh Employee ctc");
		double ctc=sc.nextDouble();
		Employee e = new Employee(id, ctc);
		return e;
	}
}
