package com.jspider.linkedlist;

public class MainLinkedLIst {

	public static void main(String[] args) {
		LinkListIMP l1=new LinkListIMP();
		l1.insert(12);
		l1.insert(14);
		l1.insert(16);
		
		l1.dispaly();
		l1.delete();
		l1.dispaly();
		l1.delete();
		l1.dispaly();
		l1.delete();
		l1.dispaly();
		l1.delete();
	}

}
