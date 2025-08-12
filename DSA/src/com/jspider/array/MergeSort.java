package com.jspider.array;

public class MergeSort {
	
	static void sort(int[] arr, int l, int h, int mid) {
		int[] leftArr=new int[mid-l+1];
		int[] rightArr=new int[h-mid];
		int x=0;
		for(int i=l;i<=mid;i++) {
			leftArr[x]=arr[i];
			x++;
		}
		x=0;
		for(int i=mid+1;i<=h;i++) {
			rightArr[x]=arr[i];
			x++;
		}
//		System.out.print("[");
//		for(int i=0; i<leftArr.length;i++) {
//			System.out.print(leftArr[i]+" ");
//		}
//		System.out.println("]");
//		System.out.println();
//		System.out.print("[");
//		for(int i=0; i<rightArr.length;i++) {
//			System.out.print(rightArr[i]+" ");
//		}
//		System.out.print("]");
		
		
		int k=l, i=0, j=0;
		while(i<leftArr.length && j<rightArr.length) {
			if(leftArr[i]<rightArr[j]) {
				arr[k++]=leftArr[i++];
			}
			else {
				arr[k++]=rightArr[j++];
			}
		}
		while(i<leftArr.length) {
			arr[k++]=leftArr[i++];
		}
		while(i<rightArr.length) {
			arr[k++]=leftArr[j++];
		}
		
		
	}
	
	static void merge(int[] arr, int l,int h) {
		if(l<h) {
			int mid = l+h/2;
			merge(arr, l, mid);
			merge(arr, mid+1, h);
			sort(arr, l,h,mid);
		}
		
	}

	public static void main(String[] args) {
		int[] arr= {25,1,5,12,16,20,3,7,9,13,34};
		merge(arr,0, arr.length-1);
		

	}

}
