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
			//adjmat[dest][src] = wt; // in directed graph - not required
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
	
	public int findMinDistVertex(int dist[], boolean spt[]) {
		int minDist = INF, minDistVertex = -1;
		for(int i = 0 ; i < vertexCount ; i++) {
			if(!spt[i] && dist[i] < minDist) {
				minDist = dist[i];
				minDistVertex = i;
			}
		}
		return minDistVertex;
	}
	
	public void dijkshtrasAlgo(int start) {
		// create arrays for spt, keys, parent
		boolean spt[] = new boolean[vertexCount];
		int dist[] = new int[vertexCount];
		int parent[] = new int[vertexCount];
		for(int i = 0 ; i < vertexCount ; i++) {
			spt[i] = false;
			dist[i] = INF;
			parent[i] = -1;
		}
		// make key of start vertex equal to 0
		dist[start] = 0;
		int count = 0 ;
		while(count < vertexCount) {
			// get min key vertex
			int u = findMinDistVertex(dist, spt);
			// add min key vertex into mst
			System.out.println("u : " + u);
			spt[u] = true;
			// increment count
			count++;
			// update distances of all adjacent vertices
			for(int v = 0 ; v < vertexCount ; v++) {
				if(adjmat[u][v] != INF &&  !spt[v] && (dist[u] + adjmat[u][v]) < dist[v]) {
					dist[v] = dist[u] + adjmat[u][v];
					parent[v] = u;
				}
			}
		}// repeat untill all vertices are added into mst
		
		// print shortest path of all vertices from start vertex
		System.out.println("Distances from " + start + " : ");
		for(int i = 0 ; i < vertexCount ; i++)
			System.out.println(start + "->" + i + " : " + dist[i]);
		
	}

}







