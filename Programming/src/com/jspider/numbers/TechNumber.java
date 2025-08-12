package com.jspider.numbers;

public class TechNumber {
	static int pow(int num1 , int power) {
		int value=1;
		
		for(int i=0; i<power; i++) {
			value*=num1;
		}
		return value;
	}
	static int check(int n) {
	int len=0;
	int tempnum=n;
	while(tempnum!=0) {
		 tempnum/=10;
		 len++;
	}
	int power=len/2;
	int divNum=pow(10,power);
	int part1=n%divNum;
	int part2=n/divNum;
	int sum=part1+part2;

	return pow(sum, 2);
	}

	public static void main(String[] args) {
		System.out.println(check(2025)==2025);
	}

}
