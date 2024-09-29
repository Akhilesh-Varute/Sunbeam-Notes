package com.sunbeam;

import java.util.Scanner;

public class Person {
	private String name;

	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	public void acceptData() {
		System.out.print("Enter name - ");
		this.name = new Scanner(System.in).next();
	}

	public void displayData() {
		System.out.println("Name - " + this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
