package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-19 18:45
 */

public class Demo05Main {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(3, "Pen", 20.0));
		list.add(new Product(5, "Pencil", 5.0));
		list.add(new Product(1, "Eraser", 3.0));
		list.add(new Product(4, "Notebook", 80.0));
		list.add(new Product(2, "Marker", 50.0));
		
		class ProductIdComparator implements Comparator<Product> {
			@Override
			public int compare(Product p1, Product p2) {
				int diff = p1.getId() - p2.getId();
				return diff;
			}
		}
		Comparator<Product> idComp = new ProductIdComparator();
		list.sort(idComp);
		System.out.println("Products sorted by Id (Asc): ");
		for (Product p : list)
			System.out.println(p);
		
		class ProductNameComparator implements Comparator<Product> {
			@Override
			public int compare(Product p1, Product p2) {
				int diff = p1.getName().compareTo(p2.getName());
				return diff;
			}
		}
		list.sort(new ProductNameComparator());
		System.out.println("Products sorted by Name (Asc): ");
		for (Product p : list)
			System.out.println(p);
		
		// Named object "priceAscComp" of Anonymous "$1" class
		Comparator<Product> priceAscComp = new Comparator<>() {
			public int compare(Product p1, Product p2) {
				int diff = Double.compare(p1.getPrice(), p2.getPrice());
				return diff;
			}
		};
		list.sort(priceAscComp);
		System.out.println("Products sorted by Price (Asc): ");
		for (Product p : list)
			System.out.println(p);
		
		// Anonymous object of Anonymous "$2" class
		list.sort(new Comparator<Product>() {
			public int compare(Product p1, Product p2) {
				int diff = -Double.compare(p1.getPrice(), p2.getPrice());
				return diff;
			}
		});
		System.out.println("Products sorted by Price (Desc): ");
		for (Product p : list)
			System.out.println(p);
	}
}









