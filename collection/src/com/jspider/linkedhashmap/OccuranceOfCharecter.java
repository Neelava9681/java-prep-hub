package com.jspider.linkedhashmap;

import java.util.LinkedHashMap;

public class OccuranceOfCharecter {
	public static void main(String[] args) {
		LinkedHashMap<Character, Integer> lm=new LinkedHashMap<Character, Integer>();
		
		String str="Neelava";
		
		for(int i=0; i<str.length();i++) {
			char temp=str.charAt(i);
			if(lm.containsKey(temp)) {
				int a=(int)lm.get(temp);
				a++;
				lm.put(temp,a);
			}
			else {
				lm.put(temp, 1);
			}
		}
		
		System.out.println(lm);
	}
}
