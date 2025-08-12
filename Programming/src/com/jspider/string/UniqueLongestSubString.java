package com.jspider.string;

import java.util.ArrayList;
import java.util.Iterator;

public class UniqueLongestSubString {
	
	static boolean isUnique(String s) {
		int[] arr = new int[256];
		
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)]++;
		}
		for (int i = 0; i < s.length(); i++) {
			if(arr[s.charAt(i)]>1) {
				return false;
			}
		}
		return true;
	}
	
	static int search(String s) {
		int max=0;
		for(int i=0; i<s.length();i++) {
			for(int j=i; j<s.length();j++) {
				String temp=s.substring(i, j+1);
			
				if(temp.length()>max && isUnique(temp)) {
					max=temp.length();
				}
			}
		}
		
		return max;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(search("joy"));
		
	}

}
