package com.jspider.object.equals;

class Student4{
	int rollNo;
	
	Student4(int rollNo){
		this.rollNo=rollNo;
	}
	@Override
	public boolean equals(Object obj) {

		 Student4 sd1 = (Student4) obj; 
		    if(this.rollNo==sd1.rollNo) {
		    	return true;
		    }
		    else return false;
	}
}

public class Program2 {

	public static void main(String[] args) {
		
		Student4 s3= new Student4(6);
		Student4 s4= new Student4(6);
		
		System.out.println(s3.equals(s4));
	}

}
