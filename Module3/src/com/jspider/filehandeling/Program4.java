package com.jspider.filehandeling;

import java.io.File;

public class Program4 {

	public static void main(String[] args) {
		File obj=new File("C:/FILEIO/Demo.txt");
		boolean flag = obj.exists();
		if(flag==true) {
			System.out.println(obj.length());
			System.out.println(obj.getAbsolutePath());
		}
		else {
			System.out.println("File does't  exits");
		}

	}

}
