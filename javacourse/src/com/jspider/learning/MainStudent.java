package com.jspider.learning;
class Student{
	Student(){
		System.out.println("Fresher Student");
	}
	Student(double exp){
		System.out.println("Experience Student");
	}
}



public class MainStudent {

	public static void main(String[] args) {
		Student a1=new Student();
		Student a2=new Student(3.5);
		
	}

}
