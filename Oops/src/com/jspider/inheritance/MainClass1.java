package com.jspider.inheritance;

class Demo{
	int val=10;
	void test() {
		System.out.println("the test is executing....");
	}	
}

class Sample extends Demo{
	
}


public class MainClass1 {

	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.test();
		System.out.println(s1.val);

	}

}
