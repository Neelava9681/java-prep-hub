package com.jspider.twoDArray;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of outer array:");
		int outerN=sc.nextInt();
		
		
		System.out.println("Enter the size of inner array:");
		int innerN=sc.nextInt();
		
		int[][] arr= new int[outerN][innerN];
		
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		sc.close();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
