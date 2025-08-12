package com.jspider.constructerchaining;

class Alpha{
	Alpha(){
		System.out.println("this is the Zero argument constructor");
	}
	
	
	Alpha(int a){
		this();
		System.out.println("this is the parameterize constructor");
	}
	
	
}

class Beta extends Alpha{
	Beta(){
		super(10);
		System.out.println("this is the Beta constructor");
	}
	
}

public class Program5 {

	public static void main(String[] args) {
		Beta b1 = new Beta();
	}

}
