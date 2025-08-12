package com.jspider.linkedlist;

class Node{
	int value;
	Node next;
	Node(int value){
		this.value=value;
	}
}

public class LinkListIMP {

	Node head, tail;
	void insert(int value) {
		Node n=new Node(value);
		if(head==null){
			head=n;
			tail=n;
		}
		else {
			tail.next=n;
			tail=n;
		}
		System.out.println("The data is inserted: "+value);
	}
	
	void dispaly() {
		System.out.println("========================= Display The Data =================================");
		if(head==null) {
			System.out.println("empty");
		}
		else {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.value+"\t");
				temp=temp.next;
			}
		}
		System.out.println();
	}
	
	void delete() {
		if(head==null) {
			System.out.println("the list already empty");
		}
		else if(head.next==null) {
			head=null;
			tail=null;
		}
		else {
			Node temp=head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			tail=temp;
			tail.next=null;
			
		}
	}
}
