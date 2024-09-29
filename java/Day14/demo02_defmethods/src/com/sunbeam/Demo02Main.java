package com.sunbeam;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-20 08:41
 */

interface Displayable {
	default void show() {
		System.out.println("Displayable.show() called.");
	}
}

interface Printable {
	default void show() {
		System.out.println("Printable.show() called.");
	}
}

/*
// Compiler error: Duplicate default methods named show
class FirstClass implements Displayable, Printable {
	
}
*/

/*
class SecondClass implements Displayable, Printable {
	@Override
	public void show() {
		System.out.println("SecondClass.show() called.");
	}
}
*/

/*
class SuperClass {
	public void show() {
		System.out.println("SuperClass.show() called.");
	}
}

class ThirdClass extends SuperClass implements Displayable {	
}
*/

class FourthClass implements Displayable, Printable {
	@Override
	public void show() {
		System.out.println("FourthClass.show() called.");
		Displayable.super.show();
		Printable.super.show();
	}
}


public class Demo02Main {
	public static void main(String[] args) {
		/*
		SecondClass obj2 = new SecondClass();
		obj2.show(); // SecondClass.show()
		*/
	
		/*
		//ThirdClass obj3 = new ThirdClass();
		//obj3.show(); // SuperClass.show()
		Displayable obj3 = new ThirdClass(); // up-casting
		obj3.show(); // SuperClass.show()
		*/
		
		FourthClass obj4 = new FourthClass();
		obj4.show();
	}
}
