package com.jspider.arrayobjects;

import java.util.Scanner;

public class MainClass1 {
	static Scanner sc=new Scanner(System.in);
	static TextBook input() {
		System.out.println("Enter the student id:");
		int id=sc.nextInt();
		String bookName=sc.next();
		String autherName=sc.next();
		int pageNo=sc.nextInt();
		double price=sc.nextDouble();
		
		TextBook t=new TextBook(id, bookName, autherName, pageNo, price);
		return t;
	}

	public static void main(String[] args) {
		int count=1;
		System.out.println("Enter the number of Student:");
		int numberOfBooks=sc.nextInt();
		
		TextBook[] t1= new TextBook[numberOfBooks];
		
//		t1[0]=new TextBook(1, "java", "pavan", 120, 6000.0);
//		t1[1]=new TextBook(2, "python", "unknown", 10, 100.0);
//		t1[2]=new TextBook(3, "sql", "sweta", 60, 6000.0);
		
		for (int i = 0; i < t1.length; i++) {
			System.out.println("Enter the student"+count+" details:");
			t1[i]=input();
			count++;
		}
		
		
		
		for(int i = 0; i < t1.length; i++) {
			System.out.println(t1[i].id+"\t"+t1[i].bookName+"\t"+t1[i].autherName+"\t"+t1[i].pageNo+"\t"+t1[i].price);
		}

	}

}
