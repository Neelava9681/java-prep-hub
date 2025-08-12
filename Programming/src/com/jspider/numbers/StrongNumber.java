package com.jspider.numbers;

public class StrongNumber {
	
	static int check(int n) {
		int num;
		int res=0;
		while(n!=0) {
			num=n%10;
			n=n/10;
			int count=1;
			for(int i=1; i<=num; i++) {
				count=count*i;
			}
			res=res+count;
			count=1;
		}
		return res;
	}
	public static void main(String[] args) {
		int n=145;
		
		System.out.println(check(n)==n);

	}

}
