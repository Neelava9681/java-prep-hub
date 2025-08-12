package com.jspider.object.printwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Program2 {

	public static void main(String[] args) throws IOException {
		PrintWriter ref=null;
		try {
			ref = new PrintWriter(new FileWriter("C:/FILEIO/Sample.txt"));
			
		} catch ( IOException e) {
			// TODO: handle exception
		}

	}

}
