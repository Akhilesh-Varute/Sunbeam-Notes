package com.sunbeaminfo.areacalculation.shapes;

import java.util.Scanner;

public class Square {
	int side;

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side = ");
		side = sc.nextInt();
	}
	
	public void calculateArea() {
		System.out.println("Area of Square = "+side*side);
	}
}
