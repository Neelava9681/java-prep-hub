package com.jspider.array;
import java.util.Scanner;

public class Sum {
	
	static int sumArray(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length; i++){
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		System.out.println(size);
		int[] arr = new int[size];
		System.out.println("Enter the Array Elements");
		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();
		}
		int sum=sumArray(arr);
		System.out.println("The Sum is "+sum);
		
	}

}
