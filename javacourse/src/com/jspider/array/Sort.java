package com.jspider.array;

public class Sort {
	
	static int[] check(int[] arr) {
//		 temp=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {4,2,11,52,13,90,6};
		
		
		int[] sorted=check(arr);
		
		for(int i=0;i<sorted.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
