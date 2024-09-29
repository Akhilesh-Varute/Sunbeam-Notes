package com.sunbeam;

import java.util.Scanner;

public class Employee {
	private int empid;
	private String name;
	private double salary;
	private Date joiningDate; // Association
	private Vehicle vehicle;

	public Employee() {

		this.joiningDate = new Date(); // Composition
	}

	public Employee(int empid, String name, double salary, int day, int month, int year) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.joiningDate = new Date(day, month, year); // Composition
	}

	public Employee(int empid, String name, double salary, int day, int month, int year, Vehicle vehicle) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.joiningDate = new Date(day, month, year); // Composition
		this.vehicle = vehicle; // Aggegration
	}

	public void acceptEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter empid - ");
		this.empid = sc.nextInt();
		System.out.print("Enter Name - ");
		this.name = sc.next();
		System.out.print("Enter Salary - ");
		this.salary = sc.nextDouble();
		System.out.println("Enter the date of Joining - ");
		this.joiningDate.acceptDate();
		addVehicle();
	}

	private void addVehicle() {
		System.out.println("Do you own a vehicle ? ");
		System.out.println("1. Yes ");
		System.out.println("2. No ");
		System.out.println("Enter you choice - ");
		int choice = new Scanner(System.in).nextInt();
		if (choice == 1) {
			this.vehicle = new Vehicle();
			this.vehicle.acceptVehicle();
		} else
			System.out.println("Hope you will have a vehicle soon...");
	}

	public void displayEmployee() {
		System.out.println("Empid - " + this.empid);
		System.out.println("Name - " + this.name);
		System.out.println("Salary - " + this.salary);
		System.out.print("Date of Joining - ");
		this.joiningDate.displayDate();
		if (this.vehicle != null)
			this.vehicle.displayVehicle();

	}

}
