package com.jspider.string;

public class Anangram {
	static String sort(String s) {
		char[] arr= s.toCharArray();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					char temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		return new String(arr);
		
	}
	
	public static void main(String[] args) {
		String s1= "hello";
		String s2= "lleho";
		String ans1=sort(s1);
		String ans2=sort(s2);
		if(ans1.equals(ans2)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
		}
	}


