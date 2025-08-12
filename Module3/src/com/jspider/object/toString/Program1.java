package com.jspider.object.toString;

class Student1{
	String name="Neel";
}

class Student2{
	String name="Neel";
	@Override
	public String toString() {
		
		return "The name is "+name;
	}
}

public class Program1 {

	public static void main(String[] args) {
		Student1 s1=new Student1();
		System.out.println(s1.toString());

		Student2 s2=new Student2();
		System.out.println(s2.toString());

	}

}
