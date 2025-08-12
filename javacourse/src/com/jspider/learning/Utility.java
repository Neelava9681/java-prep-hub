package com.jspider.learning;
import java.util.Scanner;

public class Utility{
	static void disp(Student1 s) {
		System.out.println("Name "+ s.name);
		System.out.println("Id "+ s.id);
	}
	
	static Student1 createStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the id: ");
		int id=sc.nextInt();
		
		System.out.print("Enter the name: ");
		String name=sc.next();
		Student1 s10=new Student1(name,id);
		return s10;
	}
}