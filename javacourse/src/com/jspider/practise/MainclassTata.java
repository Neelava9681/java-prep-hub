package com.jspider.practise;

class Tata {
	int price;
	String name;
	String type;
	String data;
	
	Tata(int price,String name,String type) {
		this.price=price;
		this.name=name;
		this.type=type;
	}
	Tata(int price,String name,String type,String data) {
		this(price,name,type);
		this.data=data;
	}
}
class Titan extends Tata{
	boolean isDigital;
	Titan(int price,String name,String type,String data,boolean isDigital){
		super(price,name,type,data);
		this.isDigital=isDigital;
	}
}
public class MainclassTata{
	public static void main(String[] args) {
		Tata t1=new Tata(45, "harrier", "car", "durable");
		Tata t2=new Tata(50, "nexon", "pokpok");
		Titan t3=new Titan(100, "raga", "watch", "calling", true);
		System.out.println("\t"+t1.price+"\t"+t1.name+"\t"+t1.type+"\t"+t1.data);
	}
}
