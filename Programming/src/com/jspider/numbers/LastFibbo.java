package com.jspider.numbers;

public class LastFibbo {
	static int find(int n) {
		if(n==1|| n==0) {
			return 0;
		}
		if(n==2) {
			return 1;
		}
		int num1=0;
		int num2=1;
		int count=2;
		int res=0;
		while(count!=n) {
			res=num1+num2;
			num1=num2;
			num2=res;
			count++;
		}
		
		return res;
		
		
	}

	public static void main(String[] args) {
		int n=3;
		System.out.println(find(n));
	}

}
