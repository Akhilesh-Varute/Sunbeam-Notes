package com.sunbeam;

public class BSTree {
	public class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}
	}
	
	private Node root;
	
	public BSTree() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void addNode(int value) {
		//1. create node with given data
		Node newnode = new Node(value);
		//2. if tree is empty
		if(isEmpty())
			//a. add newnode into root itself
			root = newnode;
		//3. if tree is not empty
		else {
			//3.1 create trav and start at root
			Node trav = root;
			while(true) {
				//3.2 if value is less than current node data
				if(value < trav.data) {
					//3.2.1 if current node left is empty
					if(trav.left == null) {
						//add value(node) in left of current node
						trav.left = newnode;
						break;
					}
					//3.2.2 if current node left is not empty
					else
						// go into left
						trav = trav.left;
				}
				//3.3 if value is greater than current node data
				else {	
					//3.3.1 if current node right is empty
					if(trav.right == null) {
						//add value(node) in right of current node
						trav.right = newnode;
						break;
					}
					//3.2.2 if current node right is not empty
					else
						// go into right
						trav = trav.right;
				}
			}//3.4 repeat step 3.2 and 3.3 till node is not added
		}
	}
	void preOrder(Node trav) {
		// stop if trav is null
		if(trav == null)
			return;
		// visit current node (print data)
		System.out.print(" " + trav.data);
		// go into left of current node
		preOrder(trav.left);
		// go into right of current node
		preOrder(trav.right);
	}
	
	void preOrder() {
		System.out.print("PreOrder : ");
		preOrder(root);
		System.out.println("");
	}
}


