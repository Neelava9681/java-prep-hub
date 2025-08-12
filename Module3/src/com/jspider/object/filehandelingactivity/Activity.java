package com.jspider.object.filehandelingactivity;

import java.io.File;
import java.io.IOException;

public class Activity {

	public static void main(String[] args) {
		File ref= new File("C:/FILEIO/Activity/c.txt");
		boolean check=ref.exists();
		if(check==false) {
			try {
				ref.createNewFile();
				System.out.println("File Created");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("File Already Exits");
		}
		

	}

}
