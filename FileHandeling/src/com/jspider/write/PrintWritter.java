package com.jspider.write;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWritter {

	public static void main(String[] args) {
		PrintWriter ref=null;
		try {
			ref = new PrintWriter("C:/Practice/hello.txt");
			ref.println("joy");
			ref.println("Sayan");
			ref.println("Neel");
			ref.println("Rohit");
			ref.flush();
			System.out.println("Written");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			ref.close();
		}

	}

}
