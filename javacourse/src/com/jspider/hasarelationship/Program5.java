package com.jspider.hasarelationship;

class Printer{
	void println() {
		System.out.println("print");
	}
}

class Computer{
	static Printer out = new Printer();
}

public class Program5 {

	public static void main(String[] args) {
		Computer.out.println();

	}

}
