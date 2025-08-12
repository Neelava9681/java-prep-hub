package com.jspider.patterns;

public class Program1 {

	public static void main(String[] args) {
		int a=11;
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(a +" ");
				a++;
			}
			a+=7;
			System.out.println();
		}

	}

}
