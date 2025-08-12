package com.jspider.upcasting;

class Product{
	
}

class Mobile extends Product{
	
}

class Water extends Product{
	
}

class Television extends Product{
	
}

class Flipkart{
	static void addToCart(Product p){
		String str=(p instanceof Mobile)?"delevery by bike":(p instanceof Television)?"delivery with truck":(p instanceof Water)?"delivery with pipe":"no";
		System.out.println(str);
	}
}

public class Program3 {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		Water w1 = new Water();
		Television t1 = new Television();
		Flipkart.addToCart(m1);
		Flipkart.addToCart(t1);
		Flipkart.addToCart(w1);
	}

}
