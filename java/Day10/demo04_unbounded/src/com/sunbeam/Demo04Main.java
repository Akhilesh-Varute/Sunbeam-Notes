package com.sunbeam;

import java.util.Date;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-16 13:27
 */


class Box<T> {
	private T obj;
	public void set(T val) {
		this.obj = val;
	}
	public T get() {
		return this.obj;
	}	
}

public class Demo04Main {
	public static void printAnyBox(Box<?> b) {
		System.out.println("Any Box: " + b.get());
	}
	
	public static void printSubNumberBox(Box<? extends Number> b) {
		System.out.println("Number (or Sub-Class) Box: " + b.get());
	}
	
	public static void printSuperNumberBox(Box<? super Number> b) {
		System.out.println("Number (or Super) Box: " + b.get());
	}

	public static void main(String[] args) {
	    Box<Number> b1 = new Box<>(); 
	    b1.set(1234L);
	    Box<Boolean> b2 = new Box<>();
	    b2.set(true);
	    Box<Character> b3 = new Box<>();
	    b3.set('A');
	    Box<String> b4 = new Box<>();
	    b4.set("Sunbeam");
	    Box<Integer> b5 = new Box<>();
	    b5.set(1);
	    Box<Double> b6 = new Box<>();
	    b6.set(3.14);
	    Box<Date> b7 = new Box<>();
	    b7.set(new Date());
	    Box<Object> b8 = new Box<>();
	    b8.set(new Object());
	    
	    printAnyBox(b1);
	    printAnyBox(b2);
	    printAnyBox(b3);
	    printAnyBox(b4);
	    printAnyBox(b5);
	    printAnyBox(b6);
	    printAnyBox(b7);
	    printAnyBox(b8);
	    
	    printSubNumberBox(b1);
	//    printSubNumberBox(b2); // error
	//    printSubNumberBox(b3); // error
	//    printSubNumberBox(b4); // error
	    printSubNumberBox(b5);
	    printSubNumberBox(b6);
	//    printSubNumberBox(b7); // error
	//    printSubNumberBox(b8); // error

	
	    printSuperNumberBox(b1);
	//    printSuperNumberBox(b2); // error
	//    printSuperNumberBox(b3); // error
	//    printSuperNumberBox(b4); // error
	//    printSuperNumberBox(b5); // error
	//    printSuperNumberBox(b6); // error
	//    printSuperNumberBox(b7); // error
	    printSuperNumberBox(b8);
	}
}



