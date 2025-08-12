package com.jspider.twoDArray;

import java.util.Iterator;

public class Occurance2 {
	public static void main(String[] args) {
		int[] arr=new int[256];
		String str="Neel";
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;
		}
		for (int i = 0; i < str.length(); i++) {
			if(arr[str.charAt(i)]>0) {
				System.out.println(str.charAt(i)+"--->"+arr[str.charAt(i)]);
				arr[str.charAt(i)]=0;
			}
		}
	}
}
