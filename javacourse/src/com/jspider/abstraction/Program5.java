package com.jspider.abstraction;

abstract class Hotstar{
	void login() {
		System.out.println("login Done");
	}
	abstract void watch();
}

class HotstarFree extends Hotstar{
	@Override
	void watch() {
		System.out.println("only trailers");
	}
}

class HotstarVIP extends Hotstar{
	@Override
	void watch() {
		System.out.println("Full access with ads");
	}
}

class HotstarPremium extends Hotstar{
	@Override
	void watch() {
		System.out.println("Full access without ads");
	}
}


public class Program5 {

	public static void main(String[] args) {
		Hotstar h;
		h=new HotstarFree();
		h.login();
		h.watch();
		h=new HotstarVIP();
		h.login();
		h.watch();
		h=new HotstarPremium();
		h.login();
		h.watch();


	}

}
