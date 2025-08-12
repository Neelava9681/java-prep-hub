package com.jspider.product;
import java.util.Scanner;

public class CreateProduct {
	
	static void dis(ProductMain p) {
		System.out.println("id: "+ p.productId);
		System.out.println("price: "+ p.price);	
	}
	
	static ProductMain create() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the product id");
		int productId=sc.nextInt();
		System.out.println("enter the product price");
		double price=sc.nextDouble();
		ProductMain p = new ProductMain(productId, price);
		return p;
		
	}

}
