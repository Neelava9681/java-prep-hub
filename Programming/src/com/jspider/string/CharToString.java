package com.jspider.string;

public class CharToString {
	
	static String convert(char[] arr) {
		String res="";
		
		for(char ele:arr) {
			res+=ele;
		}
		
		return res;
	}
	
	static String convert2(char [] arr) {
		String s=new String(arr);
		return s;
	}
	

	public static void main(String[] args) {
		char[] arr= {'n','e','e','l'};
		
		System.out.println(convert(arr));
		System.out.println(convert2(arr));
	}

}
