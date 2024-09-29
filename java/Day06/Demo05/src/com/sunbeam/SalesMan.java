package com.sunbeam;

import java.util.Scanner;

public class SalesMan extends Employee {
	private int noOfProducts;
	private double comm;

	public SalesMan() {
	}

	public SalesMan(int empid, String name, double salary, int noOfProducts, double comm) {
		super(empid, name, salary);
		this.noOfProducts = noOfProducts;
		this.comm = comm;
	}

	@Override
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		super.acceptData();
		
		System.out.print("Enter the no of products sold - ");
		this.noOfProducts = sc.nextInt();
		
		System.out.print("Enter the comm for each product - ");
		this.comm = sc.nextDouble();
	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Products sold qty - "+this.noOfProducts);
		System.out.println("Comm on each product sold - "+this.comm);
	}
	
	public void calculateTotalCommission() {
		double totalCommission = this.noOfProducts * this.comm;
		System.out.println("Total Commission - "+totalCommission);
	}

	public int getNoOfProducts() {
		return noOfProducts;
	}

	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}
	
	
	
}
