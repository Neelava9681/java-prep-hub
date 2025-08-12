package com.jspider.numbers;

public class Fibonacci {
	
	static void fibbo(int n) {
		int i=1;
		int n1=0;
		int n2=1;
		int sum=0;
		while(i<=n) {
			System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
			i++;
			
		}
	}

	public static void main(String[] args) {
		int n=10;
		fibbo(n);

	}

}
