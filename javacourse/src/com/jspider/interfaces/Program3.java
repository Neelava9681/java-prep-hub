package com.jspider.interfaces;
interface Omega{
	void run();
}

class Delta{
	void disp() {
		System.out.println("disp() executing");
	}
}

class Example extends Delta implements Omega{
	@Override
	public void run() {
		System.out.println("runinggg");
		
	}
}


public class Program3 {

	public static void main(String[] args) {
		Example ref = new Example();
		ref.run();
		ref.disp();
				
				

	}

}
