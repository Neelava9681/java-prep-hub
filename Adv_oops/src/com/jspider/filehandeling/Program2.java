package com.jspider.filehandeling;

import java.io.File;
import java.io.IOException;

public class Program2 {

	public static void main(String[] args) {
		File obj=new File("C:/FILEIO/Demo.txt");
		boolean flag = obj.exists();
		if(flag==false) {
			try {
				obj.createNewFile();
				System.out.println("File Created");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("File already exits");
		}
		}

	}


