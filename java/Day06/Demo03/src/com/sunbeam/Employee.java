package com.sunbeam;

import java.util.Scanner;

// Employee is-a Person
public class Employee extends Person {
	private int empid;
	private double salary;
	
	public Employee() {
		System.out.println("Inside Employee()");
	}
	
//	public Employee(int empid,String name, double salary) {
//		super(name);
//		System.out.println("Inside Employee(int,double)");
//		this.empid = empid;
//		this.salary = salary;
//	}

	
	public Employee( int empid,String name, double salary) {
		super(name);
		this.empid = empid;
		this.salary = salary;
	}

	public void acceptEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter empid - ");
		this.empid = sc.nextInt();
		
		this.acceptPerson();
		
		System.out.print("Enter Salary - ");
		this.salary = sc.nextDouble();
	}
	
	

	public void displayEmployee() {
		System.out.println("Empid - " + this.empid);
		
		this.displayPerson();
		
		System.out.println("Salary - " + this.salary);
	}
	
	
}
