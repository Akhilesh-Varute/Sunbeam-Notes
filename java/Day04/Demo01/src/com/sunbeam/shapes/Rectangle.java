package com.sunbeam.shapes;

public class Rectangle {
	private int length;
	private int breadth;
	
	public Rectangle() {
		this(10,5);
	}

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void calculateArea() {
		System.out.println("Area of Rectangle = "+this.length*this.breadth);
	}
	
	
}
