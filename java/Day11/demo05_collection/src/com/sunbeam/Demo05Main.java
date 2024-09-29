package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-17 12:43
 */

public class Demo05Main {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		c.add("Nilesh");
		c.add("Prashant");
		c.add("Nitin");
		c.add("Rahul");
		c.add("Sarang");
		c.add("Nilesh");
		c.add("Vishal");
		c.add("Pratik");

		System.out.println("Collection: " + c.toString());
		
		System.out.println("\nSize: " + c.size());
		
		String key = "Rahul";
		if(c.contains(key))
			System.out.println("\n" + key + " is present in collection.");
		else
			System.out.println("\n" + key + " is not in collection.");
		
		key = "Nilesh";
		c.remove(key);
		System.out.println("\nSize (After delete): " + c.size());
		System.out.println("Collection: " + c.toString());
		
		System.out.println("\nTraverse collection using for-each loop: ");
		for(String ele : c)
			System.out.println(ele);
		
		System.out.println("\nTraverse collection using Iterator: ");
		Iterator<String> itr = c.iterator();
		while(itr.hasNext()) {
			String ele = itr.next();
			System.out.println(ele);
		}
		
		c.clear(); // delete all elements		
		System.out.println("\nSize (After clear): " + c.size());
	}
}
