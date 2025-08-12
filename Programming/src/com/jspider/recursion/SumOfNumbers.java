package com.jspider.recursion;




public class SumOfNumbers {
	static int count=0;
	
	static int sum(int n) {
		if(n>0) {
			count+=n;
			sum(n-1);
		}
		return count;
	}
	
	
	public static void main(String[] args){
		System.out.println(sum(4));
	}
}
