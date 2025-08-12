package com.jspider.inheritance;

class Insta1{
	void post(){
		System.out.println("U can post photos and videos");
	}
}

class Insta2 extends Insta1{
	void Msg() {
		System.out.println("U can chat with yours friends");
	}
}

public class MainClass3 {

	public static void main(String[] args) {
		Insta1 v1 = new Insta1();
		v1.post();
		Insta2 v2 = new Insta2();
		v2.post();
		v2.Msg();
	}
}
