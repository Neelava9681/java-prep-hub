package com.jspider.numbers;

public class SumUpto0 {
	
	static int sum(int n) {
		int res=0;
		while(n/10!=0) {
			res=0;
			while(n!=0) {
				int rem = n%10;
				res +=rem;
				n/=10;
			}
			n=res;
		}
		
		return res;
	}

	public static void main(String[] args) {
		
		int n=458;
		System.out.println(sum(n));
		
	}

}
