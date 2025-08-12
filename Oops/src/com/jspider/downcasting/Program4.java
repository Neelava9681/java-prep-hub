package com.jspider.downcasting;

class Engineer{
	void meeting() {
		System.out.println("Doing Meeting with clients");
	}
}
class Developer extends Engineer{
	void developing() {
		System.out.println("Developing the software");
	}
}
class Tester extends Engineer{
	void testing() {
		System.out.println("Testing the software");
	}
}
public class Program4 {
	public static void main(String[] args) {
		Engineer ee = new Developer();
		
		if(ee instanceof Developer) {
			Developer de=(Developer)ee;
			de.meeting();
			de.developing();
		}
		if(ee instanceof Tester) {
			Tester te=(Tester)ee;
			te.meeting();
			te.testing();
		}
	}
}


