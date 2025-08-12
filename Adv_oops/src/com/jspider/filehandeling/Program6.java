package com.jspider.filehandeling;

import java.io.FileWriter;
import java.io.IOException;

public class Program6 {

	public static void main(String[] args) {
		FileWriter ref=null;
		try {
			ref = new FileWriter("C:/FILEIO/Demo.txt", true);
			ref.write("\n");
			ref.write("ABC");
			ref.write("\n");
			
			ref.write(65);
			ref.write("\n");
			
			char[] arr= {'N', 'E','E','L'};
			ref.write(arr);
			ref.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				ref.close();
				System.out.println("Successfully completed ");
				
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}

	}

}
