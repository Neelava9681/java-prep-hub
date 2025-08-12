package com.jspider.numbers;
import java.util.Scanner;

public class Alam {
	
	static String check(int day, boolean a) {
		
		String s="";
		
		if((day>=1 && day<=5) && a==true) {
			s="10:00";
		}
		if((day>=1 && day<=5) && a==false) {
			s="7:00";
		}
		
		else if((day==0 || day==1) && a==true) {
			s="7:00";
		}
		
		else {
			s="10:00";
		}
		
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the day in integer");
		
		int day=sc.nextInt();
		
		
		System.out.println("enter the vaccation in boolean");
		boolean a= sc.nextBoolean();
		
		String res=check(day, a);
		
		System.out.println(res);
		
		sc.close();

	}

}
