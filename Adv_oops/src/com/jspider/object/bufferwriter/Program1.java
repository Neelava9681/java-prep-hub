
package com.jspider.object.bufferwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program1 {

	public static void main(String[] args) throws IOException {
		BufferedWriter obj = null;
		try {
			obj=new BufferedWriter(new FileWriter("C:/FILEIO/Game.txt",true));
			obj.write("Jspider");
			obj.newLine();
			obj.write(67);
			obj.newLine();
			char[] ch= {'n','e','e','l'};
			obj.write(ch);
			obj.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				obj.close();
				System.out.println("Completed");
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
