package com.sunbeam;

import java.util.ArrayList;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-16 11:18
 */

public class Demo01Main {
	public static void main(String[] args) {
		/*
		// Java 1.4 -- Generic programming using java.lang.Object
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add("40");	// okay
		for (Object ele : list1) {
			Integer e = (Integer) ele;	// runtime ClassCastException, cannot convert "40" String to Integer
			System.out.println(e);
		}
		*/
		
		// Java 5.0 -- Generic programming using Generics (Templates)
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		//list2.add("40");	// compiler error
		for (Integer ele : list2) {
			System.out.println(ele);
		}
		
	}

}
