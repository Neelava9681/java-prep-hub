package com.jspider.numbers;

public class PrimeNumber {
	
	static String checkPrime(int num) {
		for(int i=2; i<=num/2 ; i++) {
			if(num%i==0) {
				return "This is not a prime number ";
			}
		}
		return "This is a prime number";
	}

	public static void main(String[] args) {
		int num=101;
		
		System.out.println(checkPrime(num));
	}

}
