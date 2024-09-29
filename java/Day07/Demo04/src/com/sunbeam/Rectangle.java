package com.sunbeam;

import java.util.Scanner;

public class Rectangle implements Shape {
	private int length;
	private int breadth;

	@Override
	public void acceptData(Scanner sc) {
		System.out.println("Enter the length - ");
		this.length = sc.nextInt();
		System.out.println("Enter the breadth - ");
		this.breadth = sc.nextInt();
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of Rectangle - " + (this.length * this.breadth));
	}

}
