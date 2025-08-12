package com.jspider.hashSet;




import java.util.HashSet;
class Emp{
	int id;
	double exp;
	Emp(int id, double d){
		this.id=id;
		this.exp=d;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+"|"+this.exp;
	}
}





public class Program1 {
	public static void main(String[] args) {
		HashSet h1=new HashSet();
		Emp e1=new Emp(12, 45.6);
		Emp e2=new Emp(14, 48.6);
		Emp e3=new Emp(27, 98.6);
		
		
		
		h1.add(e1);
		h1.add(e2);
		h1.add(e3);
		
		System.out.println(h1);
	}
}
