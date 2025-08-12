package com.jspider.upcasting;

class Delta{
	void run() {
		System.out.println("run() is working....");
	}
}

class Example extends Delta{
	void send() {
		System.out.println("send() is working....");
	}
}

public class Program1 {
	public static void main(String[] args) {
		Example ref = new Example();
//		ref.send();
//		ref.run();
		Delta obj=new Example();//Upcasting : Example -------> Delta
		obj.run();
		
	}

}
