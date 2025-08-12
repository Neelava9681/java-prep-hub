package com.jspider.methodoverrloading;

class WpV1{
	void features() {
		System.out.println("Sent");
	}
}

class WpV2 extends WpV1{
	@Override
	void features() {
		System.out.println("sent-delivered");
	}
}

class WpV3 extends WpV2{
	@Override
	void features() {
		System.out.println("sent-delivered-seen");
	}
}



public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WpV2 w1=new WpV3();
		
		w1.features();
		

	}

}
