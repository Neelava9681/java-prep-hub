package com.jspider.createcustomexception;
import java.util.Scanner;
class InvalidPinCodeException extends Exception{
	@Override
	public void printStackTrace() {
		System.err.println("You Entered a invalid Pin Code");
	}
}
class VerifierPin{
	static void checkPin(String str) throws InvalidPinCodeException
	{
		if(str.length()!=6) {
			throw new InvalidPinCodeException();
		}
		else {
			System.out.println("You entered correctly");
		}
	}
}
public class Program4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your pin: ");
		String pin=sc.nextLine();
		try {
			VerifierPin.checkPin(pin);
		}
		catch (InvalidPinCodeException e) {
			e.printStackTrace();
		}
	}
}
