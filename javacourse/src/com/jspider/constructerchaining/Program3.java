package com.jspider.constructerchaining;

class Amazon{
	Amazon(){
		System.out.println("Oders");
	}
	Amazon(double a){
		this();
		System.out.println("watching");
		System.out.println("fast delivery");
		System.out.println("music");
	}
}
public class Program3 {

	public static void main(String[] args) {
		Amazon a1 = new Amazon(3.5);

	}

}
