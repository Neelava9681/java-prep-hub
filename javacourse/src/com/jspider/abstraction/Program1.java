package com.jspider.abstraction;

abstract class Demo{
	abstract void test();
	abstract void disp();
	Demo(){
		
	}
}

class Sample extends Demo{
	@Override
	void test() {
		System.out.println("testingg");
	}
	@Override
	void disp() {
		System.out.println("displayinggg");
	}
}

public class Program1 {

	public static void main(String[] args) {
		Demo d=new Sample();
		d.test();
		d.disp();

	}

}
