package com.jspider.constructerchaining;

class Example{
	static void test(float val) {
		System.out.println("value" +val);
	}
}

public class Program8 {
	public static void main(String[] args) {
		Example.test(2.3f);
		Example.test(25);
		Example.test('A');
	}

}
