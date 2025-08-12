package com.jspider.filehandeling;
import java.io.File;


public class Program5 {

	public static void main(String[] args) {
		File ref = new File("C:/FILEIO");
		
		String[] arr=ref.list();
		for(int i=0;i<=arr.length-1;i++) {
			File obj=new File(ref, arr[i]);
			boolean flag=obj.isDirectory();//isFile()-------->>>is another  method for check the files present in that directory
			if(flag==true) {
				System.out.println(arr[i]);
			}
		}
	}
}
