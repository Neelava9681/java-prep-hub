package com.jspider.array;

import java.util.Arrays;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] arr = {1,2,4,3,2,4,5,3,2,4,5,6};
		Arrays.sort(arr);
		int k=removea(arr);
		for(int i=0;i<k;i++) {
			System.out.println(arr[i]);
		}
		
	}
		
		static int removea(int[] arr) {
			int i=0;
			for(int j=1;j<arr.length;j++) {
				if(arr[i]!=arr[j]) {
					i++;
					arr[i]=arr[j];
				}
			}
			return i+1;
		}
		
//		sort(arr);
//		int n=arr.length;
//		
//		int newSize=duplicate(arr, n);
//		for(int i=0; i<newSize;i++) {
//			System.out.println(arr[i]);
//		}
//	}
//	static void sort(int[] arr) {
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0; j<arr.length-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
//	}
//	
//	static int duplicate(int[] arr, int n) 
//	{
//		int count=0;
//		for(int i=0; i<arr.length-1;i++) {
//			if(arr[i]==arr[i+1]) {
//				continue;
//			}
//			else {
//				arr[count]=arr[i+1];
//				count++;
//			}
//		}
//		
//		
//		
//		
//		
//		return count;
//	}
//	
	

}

