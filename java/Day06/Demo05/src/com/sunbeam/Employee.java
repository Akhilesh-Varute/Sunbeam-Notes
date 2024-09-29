package com.sunbeam;

import java.util.Scanner;

public class Employee {
	private int empid;
	private String name;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter empid - ");
		this.empid = sc.nextInt();

		System.out.print("Enter name - ");
		this.name = sc.next();

		System.out.print("Enter Salary - ");
		this.salary = sc.nextDouble();
	}

	public void displayData() {
		System.out.println("Empid - " + this.empid);
		System.out.println("Name - " + this.name);
		System.out.println("Salary - " + this.salary);
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	

}
