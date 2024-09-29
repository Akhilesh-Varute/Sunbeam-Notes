package com.sunbeam;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-20 08:02
 */

class SomeClass {
	public void fun() {
		System.out.println("SomeClass.fun() called.");
	}
}
public class Demo01Main {
	static int num1 = 10; // outer class field
	public static void main(String[] args) {
		SomeClass ob = new SomeClass();
		ob.fun();
		final int num2 = 20; // final local variable in enclosing method
		int num3 = 30; // effectively final local variable in enclosing method
		int num4 = 40; // local variable in enclosing method
		SomeClass obj = new SomeClass() {
			@Override
			public void fun() {
				System.out.println("Anonymous.fun() called.");
				System.out.println("num1 = " + num1);
				System.out.println("num2 = " + num2);
				System.out.println("num3 = " + num3);
				//System.out.println("num4 = " + num4); // compiler error
			}
		};
		obj.fun();
		num4++; 
	}
}
