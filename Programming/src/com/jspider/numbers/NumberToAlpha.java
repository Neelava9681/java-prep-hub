package com.jspider.numbers;

public class NumberToAlpha {
	
	static String alpha(int n) {
		String[] alpha= {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"}; 
		
		String str="";
		int temp=0;
		while(n!=0) {
			temp=n%10;
			str=alpha[temp]+str;
			n/=10;
		}
		
		return str;
	}

	public static void main(String[] args) {
		int n=734;
		System.out.println(alpha(n));

	}

}
