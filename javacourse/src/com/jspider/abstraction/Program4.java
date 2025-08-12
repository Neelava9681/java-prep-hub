package com.jspider.abstraction;

abstract class Android{
	void features() {
		
	}
	abstract void ui();
	
}

class Samsung extends Android{
	void ui() {
		System.out.println("One UI");
	}
}

class Mi extends Android{
	void ui() {
		System.out.println("MI UI");
	}
}

class OnePlus extends Android{
	void ui() {
		System.out.println("Oxygen ui");
	}
}

public class Program4 {

	public static void main(String[] args) {
		Android a;
		a=new Samsung();
		a.ui();
		a=new Mi();
		a.ui();
		a=new OnePlus();
		a.ui();


	}

}
