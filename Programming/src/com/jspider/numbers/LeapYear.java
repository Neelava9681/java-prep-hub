package com.jspider.numbers;

public class LeapYear {
	
	static void check(int yr) {
		if(yr%4==0) {
			if(yr%100!=0) {
				System.out.println("leap year");
			}
			else if(yr%400==0){
					System.out.println("leap year");
			}
			else {
				System.out.println("not a leap year");
			}
			
		}
		else {
			System.out.println("not leap year");
		}
	}

	public static void main(String[] args) {
		int yr=2016;
		check(yr);
		
	}

}
