package com.jspider.array;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {4,2,11,52,13,90,6};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		for(int ele:arr) {
			System.out.println(ele+ " ");
		}

	}

}
