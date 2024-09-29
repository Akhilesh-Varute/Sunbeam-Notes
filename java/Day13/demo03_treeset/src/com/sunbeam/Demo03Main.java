package com.sunbeam;

import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-19 09:32
 */

public class Demo03Main {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		
		Collections.addAll(set, "S", "U", "N", "B", "E", "A", "M");
		System.out.println("Set: " + set);
		
		// SortedSet<> methods
		System.out.println("Set First Element: " + set.first()); // A
		System.out.println("Set Last Element: " + set.last()); // U
		
		System.out.println("Set HeadSet: " + set.headSet("E")); // A, B
		System.out.println("Set TailSet: " + set.tailSet("N")); // N, S, U
		System.out.println("Set SubSet: " + set.subSet("E", "N")); // E, M
	
		// NavigableSet<> methods
		System.out.println("Set Higher: " + set.higher("F")); // M
		System.out.println("Set Lower: " + set.lower("D")); // B
		
		System.out.print("Iterate in Descending order: ");
		Iterator<String> itr = set.descendingIterator();
		while(itr.hasNext()) {
			String e = itr.next();
			System.out.print(e + ", ");
		}
		System.out.println();
		
		NavigableSet<String> revSet = set.descendingSet();
		System.out.println("Descending Set: " + revSet);
	}
}
