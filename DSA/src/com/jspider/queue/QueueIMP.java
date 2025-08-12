package com.jspider.queue;

import java.util.Scanner;

public class QueueIMP {
	static int[] queue;
	static int rare;
	static int front;
	
	static void createQueue(int n) {
		queue=new int[n];
		System.out.println("queue is created");
		
	}
	static void enque(int ele) {
		if(rare>=queue.length-1) {
			System.out.println("queue overflow Error");
			System.exit(0);
		}
		else {
			
			queue[rare]=ele;
			rare++;
		}
	}
	static void display() {
		if(rare==front) {
			System.out.println("Queue is empty");
		}
		for(int i=front;i<rare;i++) {
			System.out.println(queue[i]);
		}
	}
	static void dequeue() {
		if(rare==front) {
			System.out.println("QueueUnderFlow error");
		}
		else{
			for(int i=front;i<rare;i++) {
				queue[i]=queue[i+1];
		}
		rare--;	
		}
		
	}
		
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of queue: ");
		int size=sc.nextInt();
		createQueue(size);
		while(true) {
			System.out.println("=======================================================");
			System.out.print("1.enque\t\t2.deque\t\t3.display\t\t4.exit");
			System.out.println();
//			System.out.println("5.clear\t\t6.isFull\t7.isEmpty\t8.Exit");
			System.out.println("=======================================================");
			
			System.out.println("Enter the Option");
			int op=sc.nextInt();
			switch(op) {
			case 1:{
				System.out.println("enter the element");
				int n=sc.nextInt();
				enque(n);
				break;
			}
			case 2:{
				dequeue();
				display();
				break;
			}
			case 3:{
				display();
				break;
			}
			case 4:{
				System.exit(0);
			}
			default:{
				System.out.println("invalid option");
			}
		}
	}
}
}