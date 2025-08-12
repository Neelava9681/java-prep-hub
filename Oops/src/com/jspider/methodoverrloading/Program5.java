package com.jspider.methodoverrloading;

class EmailV1{
	void compose() {
		System.out.println("Open new tab in a browser");
	}
}

class EmailV2 extends EmailV1{
	@Override
	void compose() {
		System.out.println("pop up box");
	}
}

public class Program5 {
	public static void main(String[] args) {
		EmailV1 e1=new EmailV2();
		e1.compose();
	}
}
