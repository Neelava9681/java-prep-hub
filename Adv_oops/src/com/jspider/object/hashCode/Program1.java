package com.jspider.object.hashCode;

class Emp1{
	int id=101;
}
class Emp2{
	int id=101;
	@Override
	public int hashCode() {
		
		return id;
	}
}

public class Program1 {

	public static void main(String[] args) {
		Emp1 e1=new Emp1();
		Emp2 e2=new Emp2();
		System.out.println(e1.hashCode());
		System.out.println(e1);
//		System.out.println(e2.hashCode());

	}

}
