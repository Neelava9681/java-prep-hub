package com.jspider.comparator;
import java.util.*;
public class Flipcart {
	String name;
	int price;
	double rating;
	Flipcart(String name,int price,double rating){
		this.name=name;
		this.price=price;
		this.rating=rating;
	}
	public String toString() {
		return ("\t"+this.name+"\t\t\t"+this.price+"\t\t\t"+this.rating);
	}
	static ArrayList<Flipcart> l1=new ArrayList<Flipcart>();
	public static void addToCart(Flipcart f) {
		l1.add(f);
	}
}
class Mobile extends Flipcart{
	Mobile(String name,int price,double rating){
		super(name,price,rating);
	}
}
class TV extends Flipcart{
	TV(String name,int price,double rating){
		super(name,price,rating);
	}
}
class Buds extends Flipcart{
	Buds(String name,int price,double rating){
		super(name,price,rating);
	}
}
class Pricewise implements Comparator<Flipcart>{
	@Override
	public int compare(Flipcart o1, Flipcart o2) {
		if(o1.price<o2.price) return -1;
		else if(o1.price>o2.price) return 1;
		else return 0;
	}
}
class Ratingwise implements Comparator<Flipcart>{
	@Override
	public int compare(Flipcart o1, Flipcart o2) {
		if(o1.rating<o2.rating) return -1;
		else if(o1.rating>o2.rating) return 1;
		else return 0;
	}
}
class Namewise implements Comparator<Flipcart>{
	@Override
	public int compare(Flipcart o1, Flipcart o2) {
		return o1.name.toLowerCase().compareTo(o2.name.toLowerCase());
	}
}
