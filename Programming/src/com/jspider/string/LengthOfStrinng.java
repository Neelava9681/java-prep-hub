package com.jspider.string;

public class LengthOfStrinng {
	
	static int check(String str) {
		int len=0;
		try {
			while(true) {
				char s=str.charAt(len);
				len++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return len;
	}
	
	
	public static void main(String[] args) {
		String str="hello";
		
		System.out.println(check(str));
	}
}
