package com.sunbeam;

import java.util.Scanner;

public class AddMat_GraphMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter vertex count : ");
		int vCount = sc.nextInt();
		
		Graph g = new Graph(vCount);
		g.acceptGraph(sc);
		//g.printGraph();
		g.dijkshtrasAlgo(2);
		
		sc.close();
	}
}

/*
6
7
0 1 7
0 2 4
0 3 8
1 2 9
1 4 5
3 4 6
3 5 2

*/











