package com.sunbeam;

import java.util.Scanner;

public class Manager extends Employee{
	private double bonus;
	
	public Manager() {
	}

	public Manager(int empid, String name, double salary, double bonus) {
		super(empid, name, salary);
		this.bonus = bonus;
	}

	@Override
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter bonus - ");
		this.bonus = new Scanner(System.in).nextDouble();
	}
	
	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Bonus - "+this.bonus);
	}
	
	public void calculateTotalSalary() {
		double totalSalary = this.bonus + this.getSalary();
		System.out.println("Total sal - "+totalSalary);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
}
