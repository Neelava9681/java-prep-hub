package com.jspider.File;

import java.io.File;

public class FolderCreate {

	public static void main(String[] args) {
		File ref=new File("C:/Practice");
		boolean check=ref.exists();
		if(!check) {
			ref.mkdir();
			System.out.println("Folder Created");
		}
		else System.out.println("Already Exits");
	}

}
