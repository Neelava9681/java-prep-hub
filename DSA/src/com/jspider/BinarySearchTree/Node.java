package com.jspider.BinarySearchTree;

class Node {
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
	}

}


class Tree{
	void insert(Node root,int ele) {
		if(root.data>ele) {
			if(root.left==null) {
				root.left=new Node(ele);
				System.out.println(ele+": has been inserted in left of \t"+root.data);
			}
			else {
				insert(root.left,ele);
			}
		}
		else {
			if(root.right==null) {
				root.right=new Node(ele);
				System.out.println(ele+": has been inserted in right of \t"+root.data);
			}
			else {
				insert(root.right, ele);
			}
		}
		
	}
	
	void preOder(Node root) {
		if(root!=null) {
			System.out.print(root.data+" ");
			preOder(root.left);
			preOder(root.right);
		}
	}
	
	void inOder(Node root) {
		if(root!=null) {
			inOder(root.left);
			System.out.print(root.data+" ");
			inOder(root.right);
		}
	}
	
	void postOder(Node root) {
		if(root!=null) {
			preOder(root.left);
			System.out.print(root.data+" ");
			preOder(root.right);
		}
	}
}


