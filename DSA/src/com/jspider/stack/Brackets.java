package com.jspider.stack;
import java.util.Scanner;

public class Brackets {
	static int top=-1;
	static char[] stack;
	
	static void push() {
		top=top+1;
		stack[top]='(';
	}
	static void pop() {
		top-=1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the brackets");
		String str=sc.next();

		boolean flag=true;
		stack= new char[str.length()-1];
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)=='(') {
				push();
			}
			else if(top!=-1) {
				pop();
			}
			else {
				flag=false;
				break;
			}
		}
		
		if(top==-1 && flag==true) {
			System.out.println("Structed");
		}else {
			System.out.println("unstructed");
		}
		sc.close();
		
	}

}
