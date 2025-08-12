package com.jspider.polymorphism;

class Developer{
	void develop() {
		
	}
}

class Frontend extends Developer{
	@Override
	void develop() {
		System.out.println("ui/ux");
	}
}

class Backend extends Developer{
	@Override
	void develop() {
		System.out.println("logics");
	}
}

public class Program6 {

	public static void main(String[] args) {
		Developer dev;
		dev = new Frontend();
		dev.develop();
		dev = new Backend();
		dev.develop();
		
	}

}
