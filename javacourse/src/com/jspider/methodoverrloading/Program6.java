package com.jspider.methodoverrloading;
class Windos8{
	void start() {
		System.out.println("files view");
	}
}

class Windows10 extends Windos8{
	@Override
	void start() {
		System.out.println("List view");
	}
}

class Windows11 extends Windows10{
	@Override
	void start(){
		System.out.println("Box view");
	}
}

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Windos8 w1=new Windows11();
		w1.start();
		

	}

}
