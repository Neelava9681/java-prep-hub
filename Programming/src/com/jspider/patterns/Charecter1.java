package com.jspider.patterns;

public class Charecter1 {
	public static void main(String[] args) {
		char val=65;
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=n;j++) {
				System.out.print(val+" ");
				val++;
			}
			val=65;
			System.out.println(" ");
		}
	}
}
