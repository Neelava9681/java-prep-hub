package com.jspider.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWritting {

	public static void main(String[] args) {
		BufferedWriter ref = null;
		try {
			ref = new BufferedWriter(new FileWriter("C:/Practice/hello3.txt"));
			ref.write("Rohit");
			ref.newLine();
			ref.write("soham");
			ref.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ref.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}

	}

}
