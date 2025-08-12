package com.jspider.numbers;

public class HappyNumber {
	static int check(int n){
		int res=0;
		int val=0;
		while(n!=0) {
			val=n%10;
			val=val*val;
			res+=val;
			n/=10;
		}
		return res;	
	}
	public static void main(String[] args) {
		int n=44;
		int res=check(n);
		while(res>=9) {
			res=check(res);
		}
		System.out.println(res==1?"this is a happy number":"this is not a happy number");
	}

}
