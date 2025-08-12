package com.jspider.exception;


//class Alpha implements Cloneable{
//	int a;
//}

//the clone() method in Java is protected in the Object class. To use it, 
//the class (Alpha in this case) must explicitly implement the Cloneable interface and override the clone() method to make it accessible.

public class Program1 {
	int a;

	public static void main(String[] args)  {
		Program1 ref=new Program1();
		ref.a=10;
		try {
			Program1 obj=(Program1)ref.clone();
//			int a=1/0;
			System.out.println("done");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("not done");
		}

	}

}
