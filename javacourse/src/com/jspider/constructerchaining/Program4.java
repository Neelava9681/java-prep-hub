package com.jspider.constructerchaining;


class Demo{
	Demo(){
		System.out.println("Demo is working");
	}
}

class Sample extends Demo{
	Sample(){
		super();
		System.out.println("Sample is Working");
	}
}

public class Program4 {

	public static void main(String[] args) {
		Sample s1 = new Sample();
	}

}
