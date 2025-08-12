package com.jspider.filehandeling;

import java.io.File;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) {
		File obj=new File("C:/FILEIO/Demo.txt");
		boolean flag = obj.exists();
		if(flag==true) {
			obj.delete();
			System.out.println("File deleted");
		}
		else {
			System.out.println("File does't  exits");
		}
		}

	}


