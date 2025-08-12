package com.jspider.upcasting;

class A{
	void test() {
		
	}
}

class B extends A{
	void disp() {
		
	}
}
class C extends B{
	void play() {
		
	}
}
public class Program2 {

	public static void main(String[] args) {
		C c1 =new C();
		c1.test();
		c1.disp();
		c1.play();
		B b1=c1;
		b1.test();
		b1.disp();
		A a1=b1;
		a1.test();
	}

}
