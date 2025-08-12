package com.jsp.test;

class Alpha{
	static int a;
	{
		a=10;
	}
}

public class Test2 {

	public static void main(String[] args) {
		Alpha obj = new Alpha();
		System.out.println(obj.a);
	}

}
