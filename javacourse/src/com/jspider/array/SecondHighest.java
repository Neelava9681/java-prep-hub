package com.jspider.array;
//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;





public class SecondHighest {
	
	 static void check(int[] arr) {
		Arrays.sort(arr);
		int n=arr.length;
		
		if(n<2){
			System.out.println("plz insert atleast 2 values");
		}
		
		for(int i=n-2; i>=0; i--) {
			if(arr[i]!=arr[n-1]) {
				System.out.println("The Second largest number is"+arr[i]);
				return;
			}
		}
		System.out.println("there is no second largest number");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the Elements of the array");
		for(int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		check(arr);
		
		sc.close();

	}

}
