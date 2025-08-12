package com.jspider.inheritance;

class Delta{
	void disp() {
		System.out.println("displaing.........");
	}
}

class Example extends Delta{
	void play() {
		System.out.println("playing.......");
	}
}

public class MainClass2 {

	public static void main(String[] args) {
		Example e1 = new Example();//sub class
		e1.disp();
		e1.play();
		
		Delta d1= new Delta();//super class
		d1.disp();

	}

}
