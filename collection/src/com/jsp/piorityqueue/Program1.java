package com.jsp.piorityqueue;

import java.util.PriorityQueue;

public class Program1 {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add(11);
		pq.add(23);
		pq.add(11);
		pq.add(15);
		
		while(pq.peek()!=null) {
			System.out.println(pq.poll());
		}
		
		
		
		
	}

}
