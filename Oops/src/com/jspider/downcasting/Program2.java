package com.jspider.downcasting;
class Alpha{
	void test() {
		System.out.println("testinggg");
	}
}

class Beta extends Alpha{
	void disp() {
		System.out.println("displayingggg");
	}
}


public class Program2 {

	public static void main(String[] args) {
		Alpha a= new Beta();
		a.test();
		Beta b = (Beta)a;
		b.test();
		b.disp();

	}

}
