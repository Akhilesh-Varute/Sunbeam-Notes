package com.sunbeam;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-19 19:21
 */

interface Shape {
	/*public static final*/ double PI = 3.14;
	/*public abstract*/ double calcArea();
	
	/*public*/ default double calcPeri() {
		return 0.0;
	}
	
	/*public*/ static double calcTotalArea(Shape[] arr) {
		double total = 0.0;
		for(Shape sh : arr) {
			double area = sh.calcArea();
			total = total + area;
		}
		return total;
	}
}

class Rectangle implements Shape {
	private int length, breadth;
	public Rectangle() {
	}
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public double calcArea() {
		return length * breadth;
	}
}

class Circle implements Shape {
	private double radius;
	public Circle() {
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double calcArea() {
		return Shape.PI * radius * radius;
	}
}

class Square implements Shape {
	private double side;
	public Square() {
	}
	public Square(double side) {
		this.side = side;
	}
	public double calcArea() {
		return side * side;
	}
	public double calcPeri() {
		return 4 * side;
	}
}


public class Demo08Main {
	public static void main(String[] args) {
		Square s = new Square(10);
		System.out.println("Square Area: " + s.calcArea()); // 100
		System.out.println("Square Peri: " + s.calcPeri()); // 40
	
		Circle c = new Circle(7);
		System.out.println("Circle Area: " + c.calcArea()); // ~154
		
		Rectangle r = new Rectangle(10, 4);
		System.out.println("Rectangle Area: " + r.calcArea()); // 40
		System.out.println("Rectangle Peri: " + r.calcPeri()); // 0
		
		Shape[] arr = new Shape[3];
		arr[0] = new Square(5.0);
		arr[1] = new Circle(7.0);
		arr[2] = new Rectangle(4, 3);
		double total = Shape.calcTotalArea(arr);
		System.out.println("Total Area: " + total);
	}
}










