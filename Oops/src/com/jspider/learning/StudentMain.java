package com.jspider.learning;


class Student1{
	String name;
	int id;
	Student1(String name, int id){
		this.name=name;
		this.id=id;
	}
}


public class StudentMain {

	public static void main(String[] args) {
//		Student1 s1 = new Student1("Neel30", 20);
//		Utility.disp(s1);
		
		Student1 createdStudent=Utility.createStudent();
		Utility.disp(createdStudent);

	}

}
