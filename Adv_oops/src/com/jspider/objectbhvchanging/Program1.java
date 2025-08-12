package com.jspider.objectbhvchanging;

class Student{
	private String name;
	private int id;
	private double cgpa;
	
	Student(String name, int id, double cgpa){
		this.name =name;
		this.id=id;
		this.cgpa=cgpa;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student name is "+name;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student sd = (Student) obj;
		return (this.id == sd.id);
		
	}
}

public class Program1 {

	public static void main(String[] args) {
		Student ref = new Student("Neel", 8, 8.03);
		
		System.out.println(ref.hashCode());
		System.out.println(ref.toString());
		
		System.out.println(ref.equals(new Student("Sayan", 9, 9.0)));;

	}

}
