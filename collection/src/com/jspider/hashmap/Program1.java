package com.jspider.hashmap;

import java.util.*;


public class Program1 {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		
//		System.out.println("is it empty: "+hm.isEmpty());
		
		hm.put(20, "neelava");
		hm.put(3.5, 12324);
		hm.put("name", "Soham");
		hm.put("joy",null);
		hm.put("size20", "soumyaKriti");
		hm.put(null, "heyy");
		hm.put(null,89);
		
		System.out.println(hm);
		
		
//		Object value = hm.get(20);
//		System.out.println(value instanceof String);
		
//		hm.remove(20);
//		System.out.println(hm);
		
//		System.out.println(hm.containsKey(20));
//		System.out.println(hm.containsValue("neel"));
//		
//		System.out.println("--".repeat(20));
//		System.out.println("Get all the keys"+hm.keySet());
//		System.out.println("--".repeat(20));
//		
//		Set s = hm.keySet();
//		
//		System.out.println(s instanceof Set);
//		
//		
//		
//		for(Object key:s) {
//			Object res=hm.get(key);
//			System.out.println(key+"==>"+res);
//		}

	}

}
