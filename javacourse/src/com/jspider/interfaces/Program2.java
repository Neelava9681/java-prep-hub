package com.jspider.interfaces;

interface Alpha{
	void run();
}

interface Beta{
	void play();
}

class Gamma implements Beta,Alpha{
	@Override
	public void play() {
		
		
	}
	
	@Override
	public void run() {
		
		
	}
}

public class Program2 {
	public static void main(String[] args) {
		Gamma ref = new Gamma();
		ref.run();
		ref.play();

	}

}
