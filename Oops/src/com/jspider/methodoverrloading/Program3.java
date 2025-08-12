package com.jspider.methodoverrloading;

class FbOld{
	void react() {
		System.out.println("like");
	}
}

class FbNew extends FbOld{
	@Override
	void react() {
		System.out.println("like, love, sad, angry");
	}
}

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FbOld f1= new FbOld();
		f1.react();
		FbNew f2=new FbNew();
		f2.react();
		
		FbOld f3=new FbNew();
		f3.react();
		

	}

}
