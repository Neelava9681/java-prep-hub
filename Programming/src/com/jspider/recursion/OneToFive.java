package com.jspider.recursion;

public class OneToFive {
	static void dis(int n) {
		if(n>=0){
			
			System.out.println(n);
			dis(n-1);
			if(n!=0) {
				System.out.println(n);
			}
			
		}
	}

	public static void main(String[] args) {
		System.out.println("start");
		dis(4);
		System.out.println("end");
	}

}
