package com.jspider.product;

public class Product {

	public static void main(String[] args) {
		ProductMain p1 = CreateProduct.create();
		ProductMain p2 = CreateProduct.create();
		CreateProduct.dis(p1);
		CreateProduct.dis(p2);
	}

}
