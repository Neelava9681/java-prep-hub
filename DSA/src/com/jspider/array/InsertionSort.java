package com.jspider.array;

public class InsertionSort {
	static void sort(int[] arr) {
		for(int i=0; i < arr.length; i++){    
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	
	
	static void add(int a) {
		a+=2;
	}
	public static void main(String[] args) {
		int[] arr2= {5,4,1,3,6,2};
		sort(arr2);
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
		System.out.println();
		
		int a=6;
		add(a);
		System.out.println(a);
	}
}
