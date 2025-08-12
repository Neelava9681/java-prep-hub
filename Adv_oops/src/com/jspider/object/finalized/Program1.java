package com.jspider.object.finalized;

class Person{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("cleared");
	}
}

public class Program1 {

	public static void main(String[] args) {
		
		Person p1=new Person();
		System.gc();
		System.out.println(p1);
		p1=null;
		
		System.gc();//it will execute at the last 
		System.out.println(p1);
		
		System.out.println(10+5);
		
		

	}

}
