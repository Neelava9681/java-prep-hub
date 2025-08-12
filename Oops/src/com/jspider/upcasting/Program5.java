package com.jspider.upcasting;

class Fruit{
	
}

class Apple extends Fruit{
	
}

class Mango extends Fruit{
	
}

class Lichi extends Fruit{
	
}

class BigBasket{
	static void addToCart(Fruit f){
		System.out.println("product Added in basket");
	}
}

public class Program5 {

	public static void main(String[] args) {
		Apple a1 = new Apple();
		Mango m1 = new Mango();
		Lichi l1 = new Lichi();
		BigBasket.addToCart(a1);
		BigBasket.addToCart(m1);
		BigBasket.addToCart(l1);
		
	}

}
