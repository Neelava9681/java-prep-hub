package com.jspider.string;

public class ChangeCase {

	public static void main(String[] args) {
		String str="weLcomE 12@Hi By#E";
		String res="";
		
		for(int i=0;i<str.length();i++) {
			char temp=str.charAt(i);
			 if (temp >= 'a' && temp <= 'z') { 
	                temp -= 32; 
	            } else if (temp >= 'A' && temp <= 'Z') { 
	                temp += 32; 
	            }
			res+=temp;
		}
		System.out.println(str);
		System.out.println(res);

	}

}
