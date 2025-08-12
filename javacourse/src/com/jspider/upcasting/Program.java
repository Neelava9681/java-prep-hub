package com.jspider.upcasting;
class Food{
	
}

class Biriyani extends Food{
	
}
class Dhosa extends Food{
	
}
class Rice extends Food{
	
}

class Swiggy{
	static void addToCart(Food f) {
		System.out.println("Food Added to cart");
	}
}

public class Program {

	public static void main(String[] args) {
		Biriyani b1 = new Biriyani();
		Dhosa d1 = new Dhosa();
		Rice r1 = new Rice();
		
		Swiggy.addToCart(b1);
		Swiggy.addToCart(d1);
		Swiggy.addToCart(r1);
		
	}

}
