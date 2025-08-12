package com.jspider.inheritance;

class Whatsapp1{
	void chat() {
		System.out.println("we can chat");
	}
}
class Whatsapp2 extends Whatsapp1{
	void video(){
		System.out.println("we can make a video call");
	}
}
class Whatsapp3 extends Whatsapp2{
	void payment() {
		System.out.println("Now we can make a payment");
	}
}
public class MainClass4 {
	public static void main(String[] args) {
	Whatsapp3 wp = new Whatsapp3();
	wp.chat();
	wp.video();
	wp.payment();
	}

}
