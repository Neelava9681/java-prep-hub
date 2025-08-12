package com.jspider.numbers;

public class DuckNumber {
	
	static String check(int num) {
		while(num/10!=0) {
			if(num%10==0) {
				return "Yes it is a duck number";
			}
			num/=10;
		}
		
		return "It is not";
	}

	public static void main(String[] args) {
		int num=3217304;
		
		System.out.println(check(num));
		System.out.println(2^3);
		
		
	}

}
