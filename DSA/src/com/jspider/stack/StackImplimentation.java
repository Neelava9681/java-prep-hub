package com.jspider.stack;

import java.util.Scanner;

public class StackImplimentation {
	static int[] stack;
	static int top;
	
	static void createStack(int size) {
		stack=new int[size];
		top=-1;
		System.out.println("Stack is created");
	}
	
	static void push(int ele) {
		if(top==stack.length-1) {
			System.out.println("StackOverFlow Error");
			System.exit(0);
		}
		else {
			top+=1;
			stack[top]=ele;
		}
	}
	
	static void pop() {
		if(top==-1) {
			System.out.println("StackUnderFlow Error");
		}
		else {
			System.out.println(stack[top]+" is Deleted");
			top--;
		}
	}
	
	static void peek() {
		if(top==-1) {
			System.out.println("StackUnderFlow Error");
		}
		else{
			System.out.println(stack[top]+" is the tail element");
		}
	}
	static void display() {
		System.out.println("=========== STACK DATA ===========");
		if(top==-1) {
			System.out.println("Stack is Empty");
		}
		else {
			for(int i=top; i>=0;i--) {
				System.out.println(stack[i]);
			}
		}
//		System.out.println("====================================");
	}
	static void clear() {
		top=-1;
		System.out.println("Stack has been cleared");
	}
	static void isFull() {
		if(top==stack.length-1) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	static void isEmpty() {
		if(top==-1) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=================== WELCOME TO STACK IMPLIMENTATION ===================");
		System.out.println("Enter the size of stack");
		int size=sc.nextInt();
		createStack(size);
		while(true) {
			System.out.println("=======================================================");
			System.out.print("1.push\t\t2.pop\t\t3.display\t4.peek");
			System.out.println();
			System.out.println("5.clear\t\t6.isFull\t7.isEmpty\t8.Exit");
			System.out.println("=======================================================");
			System.out.println("Enter the Option");
			int op=sc.nextInt();
			switch(op) {
			case 1:{
				System.out.println("enter the element");
				int n=sc.nextInt();
				push(n);
				break;
			}
			case 2:{
				pop();
				display();
				break;
			}
			case 3:{
				display();
				break;
			}
			case 4:{
				peek();
				break;
			}
			case 5:{
				clear();
				break;
			}
			case 6:{
				isFull();
				break;
			}
			case 7:{
				isEmpty();
				break;
			}
			case 8:{
				System.exit(0);
				break;
			}
			default:
				System.out.println("Invalid option given");
				break;
			}
		}
		
	}

}
