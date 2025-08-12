package com.jspider.numbers;

import java.util.Scanner;

public class CheckCapacity {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		Scanner sc=new Scanner(System.in);
		int lineNumber = 1;
		boolean flag=true;
		  while (flag) {
	            String line = sc.nextLine();
	            System.out.println(lineNumber + " " + line);
	            lineNumber++;
	            if(line.equals("exit")) break;
	      }
		
	}

}
