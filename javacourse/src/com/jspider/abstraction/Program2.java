package com.jspider.abstraction;

abstract class Alpha{
	abstract void play();
	void send() {
		System.out.println("sendinggg");
	}
}

class Beta extends Alpha{
	@Override
	void play() {
		System.out.println("playinggg");
	}
}

public class Program2 {

	public static void main(String[] args) {
		Alpha a1=new Beta();
		a1.send();
		a1.play();

	}

}
