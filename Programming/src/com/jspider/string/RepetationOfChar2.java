package com.jspider.string;

public class RepetationOfChar2 {
	
	static void check(String str) {
		for(int i=0;i<str.length();i++) {
			int count=1;
			char temp=str.charAt(i);
			
			 while(i+1<str.length() && temp==str.charAt(i+1)) {
	                count++;
	                i++;
	         }
			System.out.print(temp+":"+count);
		}
	}
	

	public static void main(String[] args) {
		String str="aaacccbbbeeac";
		check(str);
	}

}
