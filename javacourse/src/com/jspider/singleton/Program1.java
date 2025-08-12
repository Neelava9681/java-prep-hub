package com.jspider.singleton;

class Resource{
	private static Resource r=null;
	public static Resource getResource() {
		if(r==null) {
			r=new Resource();
			System.out.println(".......");
			
		}
		return r;
	}
	private Resource() {
		
	}
}

public class Program1 {

	public static void main(String[] args) {
		Resource r1 = Resource.getResource();
		System.out.println(r1);
		r1=null;
		System.out.println(r1);
		r1 = Resource.getResource();
		
		System.out.println(r1);
		
		
//		Resource r2 = Resource.getResource();
		
		
//		System.out.println(r2);
		

	}

}
