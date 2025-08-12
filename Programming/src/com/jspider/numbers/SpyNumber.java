package com.jspider.numbers;

public class SpyNumber {
	
	static int add(int n) {
		int res=0;
		int temp=0;
		while(n!=0) {
			temp=n%10;
			res+=temp;
			n/=10;
		}
		return res;
	}
	
	static int mul(int n) {
		int res=1;
		int temp=0;
		while(n!=0) {
			temp=n%10;
			res*=temp;
			n/=10;
		}
		return res;
	}
	
	

	public static void main(String[] args) {
		int n=1124;
		System.out.println((add(n))==(mul(n))?"this is a spy number":"this is not a spy number");

	}

}
