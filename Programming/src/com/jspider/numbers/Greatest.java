package com.jspider.numbers;

public class Greatest {
	static void check(int a, int b, int c, int d) {
		System.out.println();
		return;
	}
	public static void main(String[] args) {
		int a = 91;
		int b=321;
		int c=90;
		int d=430;
		check(a,b,c,d);
		
		int res= a>b?30:b>c?40:c<a?90:0;
		
		System.out.println(res);

	}

}
