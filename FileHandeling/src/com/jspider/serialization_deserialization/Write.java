package com.jspider.serialization_deserialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable{
	/**
	 * 
	 */
	int id;
	double sal;
	Emp(int id, double sal){
		this.id=id;
		this.sal=sal;
	}
}

public class Write {

	public static void main(String[] args) {
		FileOutputStream path=null;
		ObjectOutputStream obj=null;
		
		Emp e1=new Emp(12, 102.90);
		Emp e2=new Emp(15, 109.30);
		
		try {
			path=new FileOutputStream("C:/FILEIO/repo.txt");
			obj=new ObjectOutputStream(path);
			obj.writeObject(e1);
			obj.writeObject(e2);
			System.out.println("done");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				path.close();
				obj.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
