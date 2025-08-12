package com.jspider.string;

public class SumOfStringNumbers {
	
	static int sum(String str) {
		int sum=0;
		String[] arr=str.split(" ");
		for(String ele:arr) {
			try {
				int n=Integer.parseInt(ele);
				sum+=n;
			}
			catch (Exception e) {
				
			}
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		String str="hi hello 120 bye 24";
		System.out.println(sum(str));

	}

}
