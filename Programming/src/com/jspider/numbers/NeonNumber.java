package com.jspider.numbers;

public class NeonNumber {
	static boolean check(int n) {
		int temp=n*n;
		int count=0;
		while(temp!=0) {
			count+=temp%10;
			temp/=10;
		}
		return n==count;
	}
	public static void main(String[] args) {
		int n=9;
		System.out.println(check(n));
	}
}
