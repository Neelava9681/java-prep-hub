package com.jspider.interfaces;

interface Demo{
	void test();
	void disp();
}

class Sample implements Demo{
	@Override
	public void test() {
		System.out.println("testing");
		
	}
	@Override
	public void disp() {
		System.out.println("displaying");
		
	}
}

public class Program1 {

	public static void main(String[] args) {
		Demo ref = new Sample();
		ref.test();
		ref.disp();

	}

}
