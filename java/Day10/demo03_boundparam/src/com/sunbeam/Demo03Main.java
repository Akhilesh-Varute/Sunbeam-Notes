package com.sunbeam;

import java.util.Date;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-16 12:39
 */

class Box<T extends Number> {
	private T obj;
	public void set(T val) {
		this.obj = val;
	}
	public T get() {
		return this.obj;
	}	
	public double toDouble() {
		return obj.doubleValue();
	}
}

public class Demo03Main {
	public static void main(String[] args) {
	    Box<Number> b1 = new Box<>(); // okay
	//    Box<Boolean> b2 = new Box<>(); // error
	//    Box<Character> b3 = new Box<>(); // error
	//    Box<String> b4 = new Box<>(); // error
	    Box<Integer> b5 = new Box<>(); // okay
	    Box<Double> b6 = new Box<>(); // okay
	//    Box<Date> b7 = new Box<>(); // error
	//    Box<Object> b8 = new Box<>(); // error
	    
	    Box<Integer> x = new Box<>();
	    x.set(3);
	    Box<Double> y = new Box<>();
	    y.set(3.14);
	    if(x.toDouble() > y.toDouble())
	    	System.out.println("x is greater: " + x.get());
	    else
	    	System.out.println("y is greater: " + y.get());
	}
}









