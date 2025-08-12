package com.jspider.serialization_deserialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read {

	public static void main(String[] args) {
		FileInputStream path=null;
		ObjectInputStream obj=null;
		try {
			path=new FileInputStream("C:/FILEIO/repo.txt");
			obj = new ObjectInputStream(path);
			
		      while (true) { // Infinite loop, but will break on EOFException
	                try {
	                    Emp e = (Emp) obj.readObject();
	                    System.out.println("ID: " + e.id + ", Salary: " + e.sal);
	                } catch (EOFException eof) {
	                    break;
	                }
	            }

		} catch (Exception e) {
			System.out.println("Not done");
			e.printStackTrace();
		}finally {
			try {
				path.close();
				obj.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		

	}

}
