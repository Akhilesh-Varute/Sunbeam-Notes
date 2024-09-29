package com.sunbeaminfo.entity;

public class Employee {
	private int empid;
	String name; // default
	protected double salary;
	public String address;
	
	public void displayEmployee() {
		System.out.println(empid);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(address);
	}
	
	
}

class TestEmployee{
	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee.empid);
		System.out.println(employee.name);
		System.out.println(employee.salary);
		System.out.println(employee.address);
	}
}