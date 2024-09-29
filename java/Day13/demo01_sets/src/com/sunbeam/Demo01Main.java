package com.sunbeam;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-19 08:53
 */

public class Demo01Main {
	public static void main(String[] args) {
		//Set<Product> set = new HashSet<>(); // duplicate based on Book's hashCode() + equals()
		//Set<Product> set = new LinkedHashSet<>(); // duplicate based on Book's hashCode() + equals()
		Set<Product> set = new TreeSet<>(); // duplicate based on Book's compareTo()
		
		set.add(new Product(3, "Pen", 20.0));
		set.add(new Product(5, "Pencil", 5.0));
		set.add(new Product(1, "Eraser", 3.0));
		set.add(new Product(4, "Notebook", 80.0));
		set.add(new Product(2, "Marker", 50.0));
		set.add(new Product(5, "Pencil", 5.0)); // returns false if duplicate
		
		for (Product p : set)
			System.out.println(p);
	}
}











