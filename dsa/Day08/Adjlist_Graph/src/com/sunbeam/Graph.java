package com.sunbeam;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph {
	private int vertexCount, edgeCount;
	private List<Integer> arr[];
	public Graph(int vCount) {
		vertexCount = vCount;
		arr = new List[vertexCount];
		for(int i = 0 ; i < vertexCount ; i++)
			arr[i] = new ArrayList<Integer>();
	}
	
	public void acceptGraph(Scanner sc) {
		System.out.print("Enter edge count : ");
		edgeCount = sc.nextInt();
		System.out.println("Enter edges (src, dest) : ");
		for(int i = 0 ; i < edgeCount ; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			arr[src].add(dest);
			arr[dest].add(src);	// in directed graph - not required
		}
	}
	
	public void printGraph() {
		System.out.println("Graph : ");
		for(int i = 0 ; i < vertexCount ; i++) {
			System.out.print(i + " : ");
			for(int j : arr[i]) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}

}






