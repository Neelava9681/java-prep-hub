package com.jspider.hasarelationship;

class Demo{
	void test() {
		System.out.println("testinggg.......");
	}
}

class Sample{
	Demo obj = new Demo();
}

public class Program1 {

	public static void main(String[] args) {
		Sample sc=new Sample();
		sc.obj.test();
		
	}

}
