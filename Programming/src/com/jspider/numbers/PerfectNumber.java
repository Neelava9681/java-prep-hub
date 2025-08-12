package com.jspider.numbers;

public class PerfectNumber {

	public static void main(String[] args) {
		int count =0;
		int num =121;
		for(int i=1; i<=num/2;i++) {
			if((i*i)==num) {
				System.out.println("It is a perfect Square number");
				count++;
				break;
			}	
		}
		if(count==0) {
			System.out.println("this is not a perfact square  number");
		}
	}

}
