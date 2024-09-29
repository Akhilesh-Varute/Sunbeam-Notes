package com.sunbeam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Graph {
	private int vertexCount;
	private int edgeCount;
	private boolean adjmat[][];
	public Graph(int vCount) {
		vertexCount = vCount;
		adjmat = new boolean[vertexCount][vertexCount];
	}
	
	public void acceptGraph(Scanner sc) {
		System.out.print("Enter edge count : ");
		edgeCount = sc.nextInt();
		System.out.println("Entee edges (src, dest) : ");
		for(int i = 0 ; i < edgeCount ; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adjmat[src][dest] = true;
			adjmat[dest][src] = true;  // in directed graph - not required
		}
	}
	
	public void printGraph() {
		System.out.println("Graph : ");
		for(int i = 0 ; i < vertexCount ; i++) {
			for(int j = 0 ; j < vertexCount ; j++) {
				System.out.print(adjmat[i][j] ? 1 + " " : 0 + " ");
			}
			System.out.println("");
		}
	}
	
	public void DFSTraversal(int start) {
		// create stack to push vertices
		Stack<Integer> st  = new Stack<Integer>();
		// create an array to mark vertices
		boolean marked[] = new boolean[vertexCount];
		System.out.print("DFS Traversal : ");
		//1. Choose a vertex as start vertex. - start
		//2. Push start vertex on stack & mark it. 
		st.push(start);
		marked[start] = true;
		while(!st.isEmpty()) {
			//3. Pop vertex from stack. 
			int u = st.pop();
			//4. Print the vertex. 
			System.out.print(u + " ");
			//5. Put all non-visited neighbours of the vertex on the stack and mark them. 
			for(int v = 0 ; v < vertexCount ; v++) {
				if(adjmat[u][v] && !marked[v]) {
					st.push(v);
					marked[v] = true;
				}
			}
		}//6. Repeat 3-5 until stack is empty.
		System.out.println("");
	}
	
	public void BFSTraversal(int start) {
		// create queue to push vertices
		Queue<Integer> q = new LinkedList<Integer>();
		// create an array to mark vertices
		boolean marked[] = new boolean[vertexCount];
		System.out.print("BFS Traversal : ");
		//1. Choose a vertex as start vertex. - start
		//2. Push start vertex on queue & mark it 
		q.offer(start);
		marked[start] = true;
		while(!q.isEmpty()) {
			//3. Pop vertex from queue.
			int u = q.poll();
			//4. Print the vertex.
			System.out.print(u + " ");
			//5. Put all non-visited neighbours of the vertex on the queue and mark them. 
			for(int v = 0 ; v < vertexCount ; v++) {
				if(adjmat[u][v] && !marked[v]) {
					q.offer(v);
					marked[v] = true;
				}
			}
		}//6. Repeat 3-5 until queue is empty.
		System.out.println("");
	}
	
	public void singleSourcePathLength(int start) {
		// create queue to push vertices
		Queue<Integer> q = new LinkedList<Integer>();
		// create an array to mark vertices
		boolean marked[] = new boolean[vertexCount];
		// create an array to maintain length of vertices
		int length[] = new int[vertexCount];
		//1. Choose a vertex as start vertex. - start
		//2. Push start vertex on queue, mark it and update lenght as 0  
		q.offer(start);
		marked[start] = true;
		length[start] = 0;
		while(!q.isEmpty()) {
			//3. Pop vertex from queue.
			int u = q.poll();
			//4. Put all non-visited neighbours of the vertex on the queue and mark them. 
			for(int v = 0 ; v < vertexCount ; v++) {
				if(adjmat[u][v] && !marked[v]) {
					q.offer(v);
					marked[v] = true;
					// update length of v --> length[u] + 1
					length[v] = length[u] + 1;
				}
			}
		}//5. Repeat 3-4 until queue is empty.
		System.out.println("Lengths : ");
		for(int i = 0 ; i < vertexCount ; i++)
			System.out.println(start + "->" + i + " : " + length[i]);
	}
	
	public void DFSSpanningTree(int start) {
		// create stack to push vertices
		Stack<Integer> st  = new Stack<Integer>();
		// create an array to mark vertices
		boolean marked[] = new boolean[vertexCount];
		System.out.print("DFS Spanning Tree : ");
		//1. Choose a vertex as start vertex. - start
		//2. Push start vertex on stack & mark it. 
		st.push(start);
		marked[start] = true;
		while(!st.isEmpty()) {
			//3. Pop vertex from stack. 
			int u = st.pop();
			//5. Put all non-visited neighbours of the vertex on the stack and mark them. 
			for(int v = 0 ; v < vertexCount ; v++) {
				if(adjmat[u][v] && !marked[v]) {
					st.push(v);
					marked[v] = true;
					// print edge between u and v
					System.out.print("(" + u + "," + v + ") ");
				}
			}
		}//6. Repeat 3-5 until stack is empty.
		System.out.println("");
	}
	
	public void BFSSpanningTree(int start) {
		// create queue to push vertices
		Queue<Integer> q = new LinkedList<Integer>();
		// create an array to mark vertices
		boolean marked[] = new boolean[vertexCount];
		System.out.print("BFS Spanninf Tree : ");
		//1. Choose a vertex as start vertex. - start
		//2. Push start vertex on queue & mark it 
		q.offer(start);
		marked[start] = true;
		while(!q.isEmpty()) {
			//3. Pop vertex from queue.
			int u = q.poll();
			//5. Put all non-visited neighbours of the vertex on the queue and mark them. 
			for(int v = 0 ; v < vertexCount ; v++) {
				if(adjmat[u][v] && !marked[v]) {
					q.offer(v);
					marked[v] = true;
					// print egde between u and v
					System.out.print("(" + u + "," + v + ") ");
				}
			}
		}//6. Repeat 3-5 until queue is empty.
		System.out.println("");
	}

}







