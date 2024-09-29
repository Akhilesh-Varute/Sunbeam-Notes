package com.sunbeam;

import java.util.Scanner;

public class Graph {
	private final int INF = 999;
	private int vertexCount;
	private int edgeCount;
	private int adjmat[][];
	public Graph(int vCount) {
		vertexCount = vCount;
		adjmat = new int[vertexCount][vertexCount];
		for(int i = 0 ; i < vertexCount ; i++) 
			for(int j = 0 ; j < vertexCount ; j++)
				adjmat[i][j] = INF;
	}
	
	public void acceptGraph(Scanner sc) {
		System.out.print("Enter edge count : ");
		edgeCount = sc.nextInt();
		System.out.println("Enter edges (src, dest, wt) : ");
		for(int i = 0 ; i < edgeCount ; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int wt = sc.nextInt();
			adjmat[src][dest] = wt;
			adjmat[dest][src] = wt; // in directed graph - not required
		}
	}
	
	public void printGraph() {
		System.out.println("Graph : ");
		for(int i = 0 ; i < vertexCount ; i++) {
			for(int j = 0 ; j < vertexCount ; j++) {
				System.out.print(adjmat[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public int findMinKeyVertex(int keys[], boolean mst[]) {
		int minKey = INF, minKeyVertex = -1;
		for(int i = 0 ; i < vertexCount ; i++) {
			if(!mst[i] && keys[i] < minKey) {
				minKey = keys[i];
				minKeyVertex = i;
			}
		}
		return minKeyVertex;
	}
	
	public void primsAlgo(int start) {
		// create arrays for mst, keys, parent
		boolean mst[] = new boolean[vertexCount];
		int keys[] = new int[vertexCount];
		int parent[] = new int[vertexCount];
		for(int i = 0 ; i < vertexCount ; i++) {
			mst[i] = false;
			keys[i] = INF;
			parent[i] = -1;
		}
		// make key of start vertex equal to 0
		keys[start] = 0;
		int count = 0 ;
		while(count < vertexCount) {
			// get min key vertex
			int u = findMinKeyVertex(keys, mst);
			// add min key vertex into mst
			mst[u] = true;
			// increment count
			count++;
			// update keys of all adjacent vertices
			for(int v = 0 ; v < vertexCount ; v++) {
				if(adjmat[u][v] != INF &&  !mst[v] && adjmat[u][v] < keys[v]) {
					keys[v] = adjmat[u][v];
					parent[v] = u;
				}
			}
		}// repeat untill all vertices are added into mst
		
		// print mst and min weight
		System.out.println("Minimum Spanning Tree : ");
		int wt = 0;
		for(int i = 0 ; i < vertexCount ; i++) {
			System.out.print("(" + parent[i] + "," + i + ")");
			wt += keys[i];
		}
		System.out.println("");
		System.out.println("Min wt : " + wt);
	}

}







