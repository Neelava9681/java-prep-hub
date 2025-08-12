package com.jspider.string;

import java.util.Scanner;

public class RepetationOfChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		sc.close();
		check(str);
	}
	
	static void check(String str) {
		int[] count = new int[256];
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i)]+=1;
		}
		for(int i=0; i<str.length(); i++) {
			if(count[str.charAt(i)]!=0) {
				System.out.println("The charecter "+str.charAt(i)+" is repeated: "+count[str.charAt(i)]);
				count[str.charAt(i)]=0;
			}
		}
		
	}
}
