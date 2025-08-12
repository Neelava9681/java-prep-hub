package com.jspider.interfaces;
interface Shape{
	static int a=10;
	void draw();
}

class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("Circle Created");	
		System.out.println(Shape.a);
	}
	
}

class Square implements Shape{
	@Override
	public void draw() {
		System.out.println("Square created");
	}
}

class Toolkit{
	static void doit(Shape s) {
		if(s!=null) {
			s.draw();
		}
	}
}


public class Program4 {

	public static void main(String[] args) {
		Circle c = new Circle();
		
		
		Toolkit.doit(c);
		Square s = new Square();
		Toolkit.doit(s);
	}

}
