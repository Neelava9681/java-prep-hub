package com.jspider.filehandeling;
import java.io.File;

public class Program1 {

	public static void main(String[] args) {
	File obj=new File("C:/FILEIO/Activity");
	boolean flag = obj.exists();
	if(flag==false) {
		obj.mkdir();
		System.out.println("Folder Created");
	}
	else {
		System.out.println("Folder already exits");
	}
	}
}
