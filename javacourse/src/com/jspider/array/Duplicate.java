package com.jspider.array;
import java.util.Scanner;
import java.util.ArrayList;


public class Duplicate {
	
	static ArrayList<Integer> test(int[] arr) {
		ArrayList<Integer> duplicate = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j] && !duplicate.contains(arr[i])) {
					duplicate.add(arr[i]);
					break;
				}
			}
		}
		
		return duplicate;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] arr= new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		ArrayList<Integer> duplicate=test(arr);
		System.out.print("The dublicate numbers are: ");
		
		for(int i=0; i<duplicate.size(); i++) {
			System.out.print(duplicate.get(i)+" ");
		}
		
	}
	

}
