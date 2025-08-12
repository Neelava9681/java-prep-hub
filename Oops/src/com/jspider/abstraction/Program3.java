package com.jspider.abstraction;

abstract class Delta{
	void push() {
		System.out.println("pushingg");
	}
	void Pull() {
		System.out.println("pullingg");
	}
}

class Gama extends Delta{
	
}

public class Program3 {

	public static void main(String[] args) {
		Delta d=new Gama();
		d.push();
		d.Pull();
		d.push();
		d.Pull();

	}

}
