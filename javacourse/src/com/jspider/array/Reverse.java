package com.jspider.array;
import java.util.Scanner;

public class Reverse {
	
	static int[] rev(int[]  arr) {
		int temp;
		for(int i=0; i<arr.length/2; i++) {
			temp=arr[i];
			arr[i]=arr[(arr.length)-1-i];
			arr[(arr.length)-1-i]=temp;
		}
		 return arr; 
	}

	public static void main(String[] args) {
		System.out.println("Enter the Size of the array");
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		int [] revArr=rev(arr);
		
		for(int i=0; i<revArr.length;i++) {
			System.out.print(revArr[i]+" ");
		}
		
	}

}
