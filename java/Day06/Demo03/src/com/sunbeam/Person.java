package com.sunbeam;

import java.util.Scanner;

public class Person {
	private String name;
	
	public Person() {
		System.out.println("Inside Person()");
		}

	public Person(String name) {
		System.out.println("Inside Person(String)");
		this.name = name;
	}

	public void acceptPerson() {
		System.out.print("Enter name - ");
		this.name = new Scanner(System.in).next();
	}
	
	public void displayPerson() {
		System.out.println("Name - "+this.name);
	}
	
	
}
