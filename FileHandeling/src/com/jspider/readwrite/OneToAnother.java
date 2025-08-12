package com.jspider.readwrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class OneToAnother {

	public static void main(String[] args) {
		
		PrintWriter out=null;
		BufferedReader read1=null;
		BufferedReader read2=null;
		try {
			out = new PrintWriter("C:/FILEIO/write.txt");
			read1 = new BufferedReader(new FileReader("C:/FILEIO/read.txt"));
			read2 = new BufferedReader(new FileReader("C:/FILEIO/read2.txt"));
			String line=read1.readLine();
			while(line!=null) {
			out.println(line);
			System.out.println(line);
			line=read1.readLine();
			}
			String line2=read2.readLine();
			while(line2!=null) {
				out.println(line2);
				System.out.println(line2);
				line2=read2.readLine();
				}
			out.flush();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(read1!=null) {
					read1.close();
				}
				if(read2!=null) {
					read2.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(out!=null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
