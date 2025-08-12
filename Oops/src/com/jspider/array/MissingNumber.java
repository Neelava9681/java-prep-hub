package com.jspider.array;
//import java.io.Closeable;
//import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;


public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the Actual total");
//		int sum=sc.nextInt();
		System.out.println("Enter the Size of the Array");
		int size=sc.nextInt();
		int[] arr= new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		check(arr);
		sc.close();
	}
	
	static void check(int arr[]) {
		int a=0;
		int b=0;
		int c=0;
		for(int i=0; i<(arr.length)-1; i++) {
			a=arr[i];
			b=arr[i+1];
			c=a+1;
			if(c!=b) {
				System.out.println("The missing number is: "+c);
				return;	
			}
				
		}
	}

}
