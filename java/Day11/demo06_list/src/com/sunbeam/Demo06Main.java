package com.sunbeam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-17 13:23
 */

class Person {
	private String name;
	private int age;
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof Person) {
			Person other = (Person) obj;
			if(this.name.equals(other.name))
				return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class Demo06Main {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Nilesh", 40));
		list.add(new Person("Nitin", 45));
		list.add(new Person("Vishal", 43));
		list.add(new Person("Sarang", 47));
		
		System.out.println("Size: " + list.size());
		System.out.println();
		
		for (Person ele : list)
			System.out.println(ele);
		System.out.println();
		
		Person key = new Person("Vishal", 0);
		if(list.contains(key))
			System.out.println(key + " in list");
		else
			System.out.println(key + " not in list");
	}
	
	/*
	public static void main(String[] args) {
		List<String> c = new ArrayList<>();
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
	*/
}
