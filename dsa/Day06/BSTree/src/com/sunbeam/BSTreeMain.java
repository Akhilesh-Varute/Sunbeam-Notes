package com.sunbeam;

import java.util.List;

public class BSTreeMain {

	public static void main(String[] args) {
		BSTree bst = new BSTree();
		
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(1);
		bst.addNode(6);
		bst.addNode(14);
		bst.addNode(4);
		bst.addNode(7);
		bst.addNode(13);
		
		//bst.preOrder();
		//bst.inOrder();
		//bst.postOrder();
		
		//bst.DFSTraversal();
		//bst.BFSTraversal();
		
		/*
		BSTree.Node ret = bst.binarySearch(15);
		if(ret != null)
			System.out.println("Key is found");
		else 
			System.out.println("Key is not found");
		*/
		//bst.inOrder();
		//bst.deleteNode(8);
		//bst.inOrder();
		
		System.out.println("Height : " + bst.height());
	}

}









