package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee{
	private double commission;
	private int salesCount;
	
	
	@Override
	public void acceptData() {
		Scanner scanner = new Scanner(System.in);
		super.acceptData();
		System.out.print("Enter the commission - ");
		this.commission = scanner.nextDouble();
		System.out.print("Enter the salesCount - ");
		this.salesCount = scanner.nextInt();
	}
	
	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Commission - "+this.commission);
		System.out.println("Sales Count - "+this.salesCount);
	}
	
	@Override
	public String toString() {
		return "Salesman [commission=" + commission + ", salesCount=" + salesCount + " , "+super.toString()
				+ "]";
	}

	@Override
	public void calculateTotalSalary() {
	System.out.println("Total Salesman Salary - "+(this.basicSalary + (this.commission*this.salesCount)));	
	}
	
	
}
