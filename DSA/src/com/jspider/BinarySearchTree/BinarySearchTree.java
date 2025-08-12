package com.jspider.BinarySearchTree;

public class BinarySearchTree {

	public static void main(String[] args) {
		Tree t=new Tree();
		
		int[] arr = {50,20,10,30,90,85,95};
		
		Node root=new Node(arr[0]);
		
		for(int i=1; i<arr.length;i++) {
			t.insert(root, arr[i]);
		}
		
		t.preOder(root);
		System.out.println();
		t.inOder(root);
		System.out.println();
		t.postOder(root);

	}

}
