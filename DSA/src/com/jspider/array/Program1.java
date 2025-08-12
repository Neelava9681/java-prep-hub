package com.jspider.array;

public class Program1 {
	
	static void check(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int max=arr[i];
			for(int j=i+1; j<arr.length;j++) {
				if(arr[j]>max) {
					max=arr[j];
				}
			}
			if(i==arr.length-1) {
				arr[i]=-1;
			}
			else if(arr[i]!=max) {
				arr[i]=max;
			}
			else if(arr[i]==max) {
				arr[i]=-1;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr= {5,10,3,18,7,10,8};
		check(arr);
		

	}

}
