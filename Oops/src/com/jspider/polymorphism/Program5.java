package com.jspider.polymorphism;

class Facebook{
	void response() {
		
	}
}

class Web extends Facebook{
	@Override
	void response() {
		System.out.println("opened in web");
	}
}

class Mobile extends Facebook{
	@Override
	void response() {
		System.out.println("opened in Mobile");
	}
}


public class Program5 {

	public static void main(String[] args) {
		Facebook fb;
		fb = new Web();
		fb.response();
		fb = new Mobile();
		fb.response();
	}

}
