package com.jspider.hashtable;

import java.util.*;


public class Program1 {

	public static void main(String[] args) {
		Hashtable hm=new Hashtable();
		
		System.out.println("is it empty: "+hm.isEmpty());
		
		hm.put(20, "neelava");
		hm.put(3.5, 12324);
		hm.put("name", "Soham");
		
		hm.put("joy","kriti");
		hm.put("size 20", "soumyaKriti");
		
		
		System.out.println(hm);
	}

}
