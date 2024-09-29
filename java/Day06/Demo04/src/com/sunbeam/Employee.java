package com.sunbeam;

import java.util.Scanner;

// Employee is-a Person
public class Employee extends Person {
	private int empid;
	private double salary;

	public Employee() {
	}

	public Employee(int empid, String name, double salary) {
		super(name);
		this.empid = empid;
		this.salary = salary;
	}

	@Override
	public void acceptData() // method overriding
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter empid - ");
		this.empid = sc.nextInt();

		// this.acceptData();
		super.acceptData();

		System.out.print("Enter Salary - ");
		this.salary = sc.nextDouble();
	}

	@Override
	public void displayData() // method overriding
	{
		
		System.out.println("Empid - " + this.empid);

		// this.displayData();
		super.displayData();

		System.out.println("Salary - " + this.salary);
	}
	
	public double getSalary() {
		return salary;
	}

}
