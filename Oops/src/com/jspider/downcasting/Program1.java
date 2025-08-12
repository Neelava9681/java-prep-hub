package com.jspider.downcasting;

class A{
	
}
class B extends A{
	
}
public class Program1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ref = new B();
		B obj = (B)ref;
		System.out.println(ref);
		System.out.println(obj);
	}

}
