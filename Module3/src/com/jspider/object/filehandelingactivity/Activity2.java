package com.jspider.object.filehandelingactivity;

import java.io.PrintWriter;
import java.io.IOException;


public class Activity2 {

	public static void main(String[] args) {
		PrintWriter ref=null;
		try {
			ref = new PrintWriter("C:/FILEIO/Activity/b.txt");
			ref.println("java");
			ref.println("python");
			ref.println("testing");
			ref.println("GOVT Job");
			ref.flush();
			System.out.println("Written");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			ref.close();
		}
	}

}
