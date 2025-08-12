package com.jspider.string;

public class SumOfTheNumber {
	
	static int check(String str) {
		int res=0;
		char temp;
		for(int i=0;i<str.length();i++) {
			temp=str.charAt(i);
			if(temp>='0' && temp<='9') {
				
				res+=(temp-48);//
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String str="he4lw44";
		System.out.println(check(str));

	}

}
