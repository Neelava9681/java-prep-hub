package com.jspider.twoDArray;

public class Rotate90Degree {
	
	static void reverse(int[] arr) {
		int l=0, h=arr.length-1;
		
		while(l<h) {
			int temp=arr[l];
			arr[l]=arr[h];
			arr[h]=temp;
			l++;h++;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("======================");
		

		
	}

}
