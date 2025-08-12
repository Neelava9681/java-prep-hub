package com.jspider.string;

public class N_Biggest_Element {
	
	public static void find(String[] arr, int n) {
		String[] newArr=new String[50];
		int count=1;
		int maxLength=arr.length;
		
		if(n>maxLength) {
		System.out.println("enter a valid number to be find");
			return;
		}

		
		for(int i=arr.length-1; i>=0;i--) {
			newArr[arr[i].length()]=arr[i];
		}

		
		
		
		
			
			for(int i=newArr.length-1;i>0;i--) {
				if(newArr[i]!=null) {
					if(count==n) {
						System.out.println(newArr[i]);
						break;
					}
					else {
						count++;
					}
				}
			}
			
	
	}
	
	
	public static void main(String[] args) {
		String[] arr = {"Neel", "Soumyadeep","joy","Soham", "tanisha"};
		find(arr,5);
	}
}
