package com.jspider.string;

public class LongestWord {
	static String check(String s) {
		String[] arr=s.split(" ");
		String max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max.length()<arr[i].length()) {
				max=arr[i];
			}
		}
		
		return max;
	}
	

	public static void main(String[] args) {
		String s="hello neel hii bye neelava";
		System.out.println(check(s));

	}

}
