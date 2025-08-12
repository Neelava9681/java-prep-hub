package com.jspider.numbers;
public class AmstrongNumber {
	static int check(int num) {
		int count=0;
		int temp=num;
		int res=0;
		while(temp!=0) {
			temp/=10;
			count++;
		}
		while(num!=0) {
			int mulRes=1;
			int rem=num%10;
			for(int i=1; i<=count; i++) {
				mulRes*=rem;
			}
			res+=mulRes;
//			mulRes=0;
			num/=10;
		}
		return res;
	}
	public static void main(String[] args) {
		int num=1634;	
		System.out.println(num==check(num));
		System.out.println(check(num));
	}
}
