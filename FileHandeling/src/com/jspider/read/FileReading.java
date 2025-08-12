package com.jspider.read;

import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {
		FileReader obj=null;
		try {
			obj=new FileReader("C:/Practice/Sample.txt");
			int val=obj.read();
			
			while(val!=-1) {
				System.out.print((char)val);
				val=obj.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				obj.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		

	}

}
