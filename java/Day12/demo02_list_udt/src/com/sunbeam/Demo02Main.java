package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-18 09:02
 */

public class Demo02Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Album> list = new ArrayList<>();
		Album al;
		ListIterator<Album> itr;
		int choice;		
		do {
			System.out.print("\n1. Add Album\n2. Display All (Forward + Reverse)\n3. Search\nEnter choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1: // Add
				al = new Album();
				al.accept(sc);
				list.add(al);
				break;
			case 2: // Display All
				System.out.println("Forward display: ");
				itr = list.listIterator();
				while(itr.hasNext()) {
					al = itr.next();
					System.out.println(al);
				}
				System.out.println("Backward display: ");
				itr = list.listIterator(list.size());
				while(itr.hasPrevious()) {
					al = itr.previous();
					System.out.println(al);
				}
				break;
			case 3: // Search
				System.out.print("Enter id of album to find: ");
				int id = sc.nextInt();
				// to search in list of Albums, pass Album object "key".
				// as equals() is based on "id", the "key" should be initialized with the id.
				Album key = new Album();
				key.setId(id);
				int index = list.indexOf(key);
				if(index == -1)
					System.out.println("Album not found.");
				else {
					System.out.println("Album Found at Index: " + index);
					al = list.get(index);
					System.out.println(al);
				}
				break;
			}
		}while(choice != 0);
	}
}













