package com.sunbeam;

import java.util.Date;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-16 11:39
 */

// Java 1.4
class ObjectBox {
	private Object data;
	public void set(Object val) {
		this.data = val;
	}
	public Object get() {
		return this.data;
	}
}

// Java 5.0+
class GenericBox<TYPE> {
	private TYPE data;
	public void set(TYPE val) {
		this.data = val;
	}
	public TYPE get() {
		return this.data;
	}
}

public class Demo02Main {
	public static void main(String[] args) {
		/*
		// Java 1.4
		ObjectBox b1 = new ObjectBox();
		b1.set(new String("Hello"));
		String s1 = (String) b1.get();
		System.out.println(s1);
	
		ObjectBox b2 = new ObjectBox();
		b2.set(new Date());
		Date d2 = (Date) b2.get();
		System.out.println(d2);
		
		ObjectBox b3 = new ObjectBox();
		b3.set(new Integer(11));
		Integer i3 = (Integer) b3.get();
		System.out.println(i3);
		
		ObjectBox b4 = new ObjectBox();
		b4.set(new Double(3.14));
		String s4 = (String) b4.get(); // ClassCastException
		System.out.println(s4);
		*/
		
		// Java 5.0+
		GenericBox<String> b1 = new GenericBox<String>();
		b1.set(new String("Hello"));
		String s1 = b1.get();
		System.out.println(s1);
	
		GenericBox<Date> b2 = new GenericBox<Date>();
		b2.set(new Date());
		Date d2 = b2.get();
		System.out.println(d2);
		
		GenericBox<Integer> b3 = new GenericBox<Integer>();
		b3.set(new Integer(11));
		Integer i3 = (Integer) b3.get();
		System.out.println(i3);
		
//		GenericBox<Double> b4 = new GenericBox<Double>();
//		b4.set(new Double(3.14));
//		String s4 = b4.get(); // compiler error
//		System.out.println(s4);

	}
}

