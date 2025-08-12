package com.jspider.File;

import java.io.File;
import java.io.IOException;

public class FileCreate {
	public static void main(String[] args) {
		File ref=null;
		ref=new File("C:/Practice/Replica.txt");
		boolean check=ref.exists();
		if(!check) {
			try{
				ref.createNewFile();
				System.out.println("Created");
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		else System.out.println("Already Exits");
	}
}
