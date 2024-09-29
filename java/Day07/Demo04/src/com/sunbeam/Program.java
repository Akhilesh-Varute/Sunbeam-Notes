package com.sunbeam;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape shape = new Circle();
		shape.acceptData(sc);
		shape.calculateArea();
		
		shape = new Rectangle();
		shape.acceptData(sc);
		shape.calculateArea();
		
		sc.close();

	}

}
