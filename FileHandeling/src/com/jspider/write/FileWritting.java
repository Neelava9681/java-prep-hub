package com.jspider.write;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritting {
	public static void main(String[] args) {
		FileWriter ref = null;
		try {
			ref=new FileWriter("C:/Practice/hello2.txt");
			
			ref.write("Neelava");
			ref.write("\n");
			char[] arr = {'j','o','y'};
			ref.write(arr);
			ref.flush();
			System.out.println("Written");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				ref.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
