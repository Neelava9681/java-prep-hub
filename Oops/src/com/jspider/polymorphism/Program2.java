package com.jspider.polymorphism;

class Irctc{
	void search(String source, String destination) {
		System.out.println("List of trains");
	}
	void search(int trainNo) {
		System.out.println("Journey Details");
	}
	void search(String pnr) {
		System.out.println("Train Schedule");
	}
	
}

public class Program2 {

	public static void main(String[] args) {
		Irctc obj=new Irctc();
		obj.search("smvt", "Hwh");
		obj.search(12);
		obj.search("jw123");
	}

}
