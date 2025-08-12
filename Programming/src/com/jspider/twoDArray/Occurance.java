package com.jspider.twoDArray;

import java.util.Scanner;

public class Occurance {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter word: ");
		String str=scn.next();
		String rev=" ";
		for (int i = str.length()-1; i>=0 ; i--) {
			rev +=str.charAt(i);
		}
		System.out.println(rev);
	}
}
