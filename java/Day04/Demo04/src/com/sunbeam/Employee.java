package com.sunbeam;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void displayEmployee() {
		System.out.println("Empid  = "+this.id);
		System.out.println("Name  = "+this.name);
		System.out.println("Salary  = "+this.salary);
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
}
