package com.sunbeam;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-18 13:14
 */

public class Demo10Main {
	public static void main(String[] args) {
		//Set<String> set = new HashSet<>();
		//Set<String> set = new LinkedHashSet<>();
		Set<String> set = new TreeSet<>();
		set.add("Nilesh"); // returns true
		set.add("Nitin"); // returns true
		set.add("Vishal"); // returns true
		set.add("Nitin"); // returns false
		set.add("John"); // returns true
		System.out.println("Set size: " + set.size());
		System.out.println(set);
	}
}






