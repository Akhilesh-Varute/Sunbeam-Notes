package com.sunbeam;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-17 08:32
 */

public class Demo02Main {
	public static <T> void swap(T a, T b) {
		T t = a;
		a = b;
		b = t;
		System.out.println("In swap(): a = " + a + ", b = " + b);
	}
	
	public static void main(String[] args) {
		/* In yesterday's Box class demo --
		 * Box<Integer> b1 = new Box<>();
		 * b1.set(22);
		 * Box<Double> b2 = new Box<>();
		 * b2.set(2.2);
		 * */
		
		Integer i1 = 10, i2 = 20;
		System.out.println("Before swap(): i1 = " + i1 + ", i2 = " + i2);
		Demo02Main.swap(i1, i2); // T=Integer --> Demo02Main.swap(Integer, Integer);
		
		Double d1 = 1.1, d2 = 2.2;
		System.out.println("Before swap(): d1 = " + d1 + ", d2 = " + d2);
		Demo02Main.swap(d1, d2); // T=Double --> Demo02Main.swap(Double, Double);
	
		System.out.println("Before swap(): i1 = " + i1 + ", d2 = " + d2);
		Demo02Main.swap(i1, d2); // T=Number --> Demo02Main.swap(Number, Number);
	
		//Demo02Main.<Integer>swap(i1, d2); // T=Integer --> Demo02Main.swap(Integer, Integer);
					// compiler error: cannot convert Double to Integer

		Integer i = 1;
		String s = "One";
		System.out.println("Before swap(): i = " + i + ", s = " + s);
		Demo02Main.<Object>swap(i, s); // T=Object --> Demo02Main.swap(Object, Object);
	}
}














