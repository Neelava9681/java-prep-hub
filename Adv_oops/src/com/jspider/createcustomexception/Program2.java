package com.jspider.createcustomexception;

class IvalidMobileNumber extends Exception{
	
}
class MobileNumberVerifier{
	static void verify(String str) throws IvalidMobileNumber {
		if(str.length()!=10) {
			throw new IvalidMobileNumber();
		}
		else {
			System.out.println("The number is all right");
		}
	}
}

public class Program2 {

	public static void main(String[] args) {
		try {
			MobileNumberVerifier.verify("906252199");
		}
		catch(IvalidMobileNumber ex) {
			ex.printStackTrace();
			System.out.println("the length of the number is wrong");
		}
		
	}

}
