package com.jspider.string;

public class CountPalindrome {
	static boolean isPalindrome(String s) {
		String rev="";
		for(int i=s.length()-1; i>=0; i--) {
			rev= rev+ s.charAt(i);
		}
		return rev.equals(s);
	}

	public static void main(String[] args) {
		String s= "hello hi bye eye level yah";
		String[] arr1=s.split(" ");
		for(String ele:arr1) {
			if(isPalindrome(ele)) {
				System.out.println(ele);
			}
		}

	}

}
