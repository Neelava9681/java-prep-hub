



package com.jspider.object.filehandelingactivity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Activity3 {

	public static void main(String[] args) {
		BufferedReader ref=null;
		PrintWriter out=null;
		try {
			ref=new BufferedReader(new FileReader("C:/FILEIO/Activity/a.txt"));
			out=new PrintWriter("C:/FILEIO/Activity/c.txt"); 
			String line=ref.readLine();
			while(line!=null) {
				System.out.println(line);
				out.println(line);
				line=ref.readLine();
			}
			
			
			out.flush();
			System.out.println("completed");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				ref.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
