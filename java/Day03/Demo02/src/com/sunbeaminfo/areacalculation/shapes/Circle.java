package com.sunbeaminfo.areacalculation.shapes;

import java.util.Scanner;

public class Circle {
	int radius;
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius = ");
		radius = sc.nextInt();
	}
	
	public void calculateArea() {
		System.out.println("Area of Circle = "+3.14*radius*radius);
	}
}
