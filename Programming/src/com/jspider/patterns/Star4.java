package com.jspider.patterns;

public class Star4 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=1;j++) {
				if(i==1) {
					for(int k=1;k<=5;k++) {
						System.out.print("*"+ " ");
					}
				}
				else {
					System.out.print("*"+ " ");
				}
			}
			
			System.out.println();
		}

	}

}
