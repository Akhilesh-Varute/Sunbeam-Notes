package com.sunbeam;

import java.util.Scanner;

public class Circle implements Shape {
	private int radius;
	
	@Override
	public void acceptData(Scanner sc) {
	System.out.println("Enter radius - ");
	this.radius = sc.nextInt();
	}

	@Override
	public void calculateArea() {		
		System.out.println("Area of Circle - "+(this.radius*this.radius*PI));
	}

}
