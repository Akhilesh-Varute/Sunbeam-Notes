package com.sunbeam;

import java.util.Scanner;

public class Adjlist_GraphMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter vertex count : ");
		int vCount = sc.nextInt();
		
		Graph g = new Graph(vCount);
		g.acceptGraph(sc);
		g.printGraph();
		
		sc.close();

	}

}
