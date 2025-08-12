package com.jspider.constructerchaining;


class City2{
	int a;
	double b;
	
	City2(){
		System.out.println("First constructor");
	}
	
	City2(int a){
		this();
		this.a=a;
		System.out.println("seceond constructor");
		
	}
	City2(double b, int a){
		this(a);
		System.out.println("third constructor");
		
	}
}

public class Program10 {

	public static void main(String[] args) {
		City2 ct= new City2(3.5, 10);
		System.out.println(ct.a);

	}

}
