package com.jspider.downcasting;
class Delta{
	void run() {
		System.out.println("runingg");
	}
}

class Example extends Delta{
	void send(){
		System.out.println("sendinggg");
	}
}

public class Program3 {

	public static void main(String[] args) {
		Delta ref = new Example();
		ref.run();
		Example obj = (Example)ref;
		obj.run();
		obj.send();
		
	}

}
