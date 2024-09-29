package com.sunbeam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Demo01Main {

	public static void main(String[] args) {
		//List<String> list = new ArrayList<>();
		//List<String> list = new LinkedList<>();
		List<String> list = new Vector<>();
		
		list.add("Nilesh");
		list.add("Nitin");
		list.add("Vishal");
		list.add("Prashant");
		
		// Random Access: add at index, remove from index, get from index, set at index.
		list.add(2, "Rahul");
		System.out.println(list.toString());
		// [Nilesh, Nitin, Rahul, Vishal, Prashant]
		
		list.remove(3);
		System.out.println(list.toString());
		// [Nilesh, Nitin, Rahul, Prashant]

		String ele = list.get(1);
		System.out.println("At Index 1: " + ele);
		
		list.set(2, "Pratik");
		System.out.println(list.toString());
		// [Nilesh, Nitin, Pratik, Prashant]
		
		// Bi-directional traversal
		System.out.println("\nForward traversal: ");
		ListIterator<String> itr = list.listIterator();
		while(itr.hasNext()) {
			String e = itr.next();
			System.out.println(e);
		}
		
		System.out.println("Backword traversal: ");
		itr = list.listIterator(list.size());
		while(itr.hasPrevious()) {
			String e = itr.previous();
			System.out.println(e);
		}
		System.out.println();
		
		// searching in list
		String key = "Pratik";
		int index = list.indexOf(key);
		if(index == -1)
			System.out.println(key + " not found in list.");
		else
			System.out.println(key + " found at index: " + index);
	}

}





