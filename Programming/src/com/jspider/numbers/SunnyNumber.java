package com.jspider.numbers;

public class SunnyNumber {
	static void check(int n) {
		int temp=n+1;
		int count=0;
		for(int i=1; i<=temp/2;i++) {
			if((i*i)==temp) {
				System.out.println(n+" is the sunny number");
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println(n+" is not a sunny number");
		}	
	}
	public static void main(String[] args) {
		int n=35;
		check(n);

	}

}
