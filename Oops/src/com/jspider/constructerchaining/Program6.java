package com.jspider.constructerchaining;

class FreeAntivirus{
	FreeAntivirus(){
		System.out.println("Scan");
	}
		
}

class PaidAntiVirus extends FreeAntivirus{
	PaidAntiVirus(){
		super();//it will happen implicitly 
		System.out.println("protection");
		System.out.println("Data Security");
	}
}

public class Program6 {

	public static void main(String[] args) {
		PaidAntiVirus pv1=new PaidAntiVirus();

	}

}
