package com.jspider.array;
import java.util.Scanner;


public class MaxMin {
	
	static int[] test(int[] arr) {
		int max=arr[0];
		int min=arr[0];
		for(int i=1; i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		int[] maxMin = new int[2];
		
		maxMin[0]=max;
		maxMin[1]=min;
		
		return maxMin;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		int[] maxMin=test(arr);
		
		System.out.println("The Max Element is: "+maxMin[0]);
		System.out.println("The Min Element is: "+maxMin[1]);
	}

}
