package com.jspider.object.equals;

class Student1{
	int rollNo=5;
}
class Student2{
	int rollNo=5;
}

public class Program1 {

	public static void main(String[] args) {
		Student1 s1=new Student1();
		Student2 s2=new Student2();
		System.out.println(s1.equals(s2));//it is comparing the object psudo address
	}

}
