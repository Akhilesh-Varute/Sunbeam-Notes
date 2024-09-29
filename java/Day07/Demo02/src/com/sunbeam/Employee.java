package com.sunbeam;

import java.util.Scanner;

abstract public class Employee {
	private int empid;
	private String name;
	protected double basicSalary;

	abstract public void calculateTotalSalary();
	
	public void acceptData() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter empid - ");
		this.empid = scanner.nextInt();
		
		System.out.print("Enter name - ");
		this.name = scanner.next();
		
		System.out.print("Enter basic salary - ");
		this.basicSalary = scanner.nextDouble();
	}

	public void displayData() {
		System.out.println("Empid - "+this.empid);
		System.out.println("Name - "+this.name);
		System.out.println("Basic Salary- "+this.basicSalary);

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

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", basicSalary=" + basicSalary + "]";
	}

}
