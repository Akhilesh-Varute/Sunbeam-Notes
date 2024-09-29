package com.sunbeam;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-19 09:19
 */

public class Demo02Main {
	public static void main(String[] args) {
		/*
		Set<Product> set = new TreeSet<>(); // duplicate based on Book's compareTo()
		
		set.add(new Product(3, "Pen", 20.0));
		set.add(new Product(5, "Pencil", 5.0));
		set.add(new Product(1, "Eraser", 3.0));
		set.add(new Product(4, "Notebook", 80.0));
		set.add(new Product(2, "Marker", 50.0));
		set.add(new Product(5, "New Pencil", 6.0)); // returns false -- duplicate

		for (Product p : set)
			System.out.println(p);
		*/

		class ProductNameComparator implements Comparator<Product> {
			@Override
			public int compare(Product p1, Product p2) {
				int diff = p1.getName().compareTo(p2.getName());
				return diff;
			}
		}
		ProductNameComparator nameComparator = new ProductNameComparator();
		
		Set<Product> set = new TreeSet<>(nameComparator); // duplicate based on nameComparator.compare()
		
		set.add(new Product(3, "Pen", 20.0));
		set.add(new Product(5, "Pencil", 5.0));
		set.add(new Product(1, "Eraser", 3.0));
		set.add(new Product(4, "Notebook", 80.0));
		set.add(new Product(2, "Marker", 50.0));
		set.add(new Product(6, "Pencil", 6.0)); // returns false -- duplicate

		for (Product p : set)
			System.out.println(p);

	}
}
