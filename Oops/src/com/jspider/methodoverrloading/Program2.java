package com.jspider.methodoverrloading;

class Demo{
	void play() {
		System.out.println("cricket/football");
	}
}
class Sample extends Demo{
	@Override
	void play() {
		System.out.println("pubg/cod");
	}
}
public class Program2 {
	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.play();
		Sample s1=new Sample();
		s1.play();
		Demo ds=new Sample();
		ds.play();
	}
}
