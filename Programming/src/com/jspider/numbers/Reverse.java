package com.jspider.numbers;

public class Reverse {
	
	static void rev(int num) {
		int temp=num;
		int res = 0;
		
		while(temp>0) {
			int count = temp%10;
			res=(res*10)+count;
			temp/=10;
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		int num=123;
		
		rev(num);
		
	}

}
