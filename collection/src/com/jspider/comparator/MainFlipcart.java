package com.jspider.comparator;
import java.util.*;
public class MainFlipcart {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Mobile m1=new Mobile("Apple",50000,3.0);
		Mobile m2=new Mobile("Samsung",150000,5.0);
		Mobile m3=new Mobile("Google",35000,3.2);
		TV t1=new TV("Sony", 80000, 5.0);
		TV t2=new TV("Oneplus", 100000, 4.5);
		TV t3=new TV("LG", 40000, 2.0);
		Buds b1=new Buds("Boat", 1500, 2.5);
		Buds b2=new Buds("Realme", 3500, 4.5);
		Buds b3=new Buds("Oneplus", 2500, 5.0);
		Flipcart.addToCart(m1);
		Flipcart.addToCart(m2);
		Flipcart.addToCart(m3);
		Flipcart.addToCart(t1);
		Flipcart.addToCart(t2);
		Flipcart.addToCart(t3);
		Flipcart.addToCart(b1);
		Flipcart.addToCart(b2);
		Flipcart.addToCart(b3);
		System.out.println("Chose 1 to sort Pricewise");
		System.out.println("Chose 2 to sort Ratingwise");
		System.out.println("Chose 3 to sort Namewise");
		int num=scn.nextInt();
		switch(num) {
		case 1:
			TreeSet ts1=new TreeSet<Flipcart>(new Pricewise());
			for (int i = 0; i < Flipcart.l1.size(); i++) {
				ts1.add(Flipcart.l1.get(i));
			}
			for(Object ele:ts1) {
				System.out.println(ele);
			}
			break;
		case 2:
				TreeSet ts2=new TreeSet<Flipcart>(new Ratingwise());
				for (int i = 0; i < Flipcart.l1.size(); i++) {
					ts2.add(Flipcart.l1.get(i));
				}
				for(Object ele:ts2) {
					System.out.println(ele);
				}
				break;
		case 3:
			TreeSet ts3=new TreeSet<Flipcart>(new Namewise());
			for (int i = 0; i < Flipcart.l1.size(); i++) {
				ts3.add(Flipcart.l1.get(i));
			}
			for(Object ele:ts3) {
				System.out.println(ele);
			}
			break;
		default:
			for (int i = 0; i < Flipcart.l1.size(); i++) {
				System.out.println(Flipcart.l1.get(i));
			}
		}
		
	}
}
