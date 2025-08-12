package com.jspider.numbers;

public class PrimeSeries {
	static boolean prime(int n) {
		int count=0;
		for(int i=1; i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count==2;
		
		
	}

	public static void main(String[] args) {
		int n=11;
		int c=0;
		
		
			for(int i=1;;i++) {
				if(prime(i)) {
					System.out.println(i);
					c++;
				}
				if(c==n) {
					
					break;
				}
			}
		
		
	}

}
