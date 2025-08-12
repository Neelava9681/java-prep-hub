package com.jspider.object.toString;


public class Program2 {
	
	static int orderConfirmOtp(int id) {
		int res=1;
		while(id!=0) {
			int temp=id%10;
			res*=temp;
			id/=10;
		}
		
		return res;
	}

	public static void main(String[] args) {
		int orderId=2342;
		System.out.println(orderConfirmOtp(orderId));

	}

}




