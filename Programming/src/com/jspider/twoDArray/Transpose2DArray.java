package com.jspider.twoDArray;

public class Transpose2DArray {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr[i].length;j++) {
				int temp=arr[j][i];
				arr[j][i]=arr[i][j];
				arr[i][j]=temp;
			}
		}
		System.out.println("======================");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
}
