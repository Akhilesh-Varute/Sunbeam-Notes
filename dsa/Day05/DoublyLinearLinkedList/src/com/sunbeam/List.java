package com.sunbeam;

public class List {
	public class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data = value;
			next = null;
			prev = null;
		}
	}
	
	private Node head;
	private Node tail;
	public List() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	public void addFirst(int value) {
		//1. create node
		Node nn = new Node(value);
		//2. if list is empty
		if(isEmpty())
			//a. add newnode into head and tail
			head = tail = nn;
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			nn.next = head;
			//b. add newnode into prev of first node
			head.prev = nn;
			//c. move head on newnode
			head = nn;
		}
	}
	
	public void addLast(int value) {
		//1. create node
		Node nn = new Node(value);
		//2. if list is empty
		if(isEmpty())
			//a. add newnode into head and tail
			head = tail = nn;
		//3. if list is not empty
		else {
			//a. add last node into prev of newnode
			nn.prev = tail;
			//b. add newnode into next of last node
			tail.next = nn;
			//c. move tail on newnode
			tail = nn;
		}
	}
	
	public void addPosition(int value, int pos) {
		// special cases
			// TODO
		//1. create node
		Node nn = new Node(value);
		//2. if list is empty
		if(isEmpty())
			//a. add newnode into head and tail
			head = tail = nn;
		//3. if list is not empty
		else {
			//3.1 traverse till pos -1 node
			Node trav = head;
			for(int i = 1 ; i < pos - 1 ; i++)
				trav = trav.next;
			//a. add pos node into next of newnode
			nn.next = trav.next;
			//b. add pos-1 node into prev of newnode
			nn.prev = trav;
			//c. add newnode into next of pos-1 node
			trav.next = nn;
			//d. add newnode into prev of pos node
			nn.next.prev = nn;
		}
	}
	
	public void deleteFirst() {
		//1. if list is empty
		if(isEmpty())
			// print msg
			System.out.println("List is empty");
		//2. if list has single node
		else if(head.next == null)
			head = tail = null; 
		//3. if list has multiple node
		else {
			//a. move head on second node
			head = head.next;
			//b. add null into prev of second node
			head.prev = null;
		}
	}
	
	public void deleteLast() {
		//1. if list is empty
		if(isEmpty())
			return;
		//2. if list has single node
		else if(head.next == null)
			head = tail = null;
		//3. if list has multiple nodes
		else {
			//a. move tail on second last node
			tail = tail.prev;
			//b. add null into next of second last node
			tail.next = null;
		}
	}
	
	public void deletePosition(int pos) {
		// special case
			// TODO
		//1. if list is empty
		if(isEmpty())
			return;
		//2. if list has single nodes
		else if(head.next == null)
			head = tail = null;
		//3. if list has multiple nodes
		else {
			//a. traverse till pos node
			Node trav = head;
			for(int i = 1  ; i < pos ; i++)
				trav = trav.next;
			//b. add pos + 1 node into next of pos -1 node
			trav.prev.next = trav.next;
			//c. add pos -1 node into prev of pos + 1 node 
			trav.next.prev = trav.prev;
		}
	}
	
	public void fDisplay() {
		//1. create trav and start at head
		Node trav = head;
		System.out.print("Forward : ");
		while(trav != null) {
			//2. visit current node
			System.out.print(" " + trav.data);
			//3. go on next node
			trav = trav.next;
		}//4. repeat step 2 and 3 till last node
		System.out.println("");
	}
	
	public void rDisplay() {
		//1. create trav and start at tail
		Node trav = tail;
		System.out.print("Reverse : ");
		while(trav != null) {
			//2. visit current node
			System.out.print(" " + trav.data);
			//3. go on prev node
			trav = trav.prev;
		}//4. repeat step 2 and 3 till last node
		System.out.println("");
	}

}












