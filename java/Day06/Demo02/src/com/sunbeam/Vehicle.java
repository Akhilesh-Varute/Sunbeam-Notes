package com.sunbeam;

import java.util.Scanner;

public class Vehicle {
	private String vehName;
	private String vehNumber;

	public Vehicle() {
	}

	public Vehicle(String vehName, String vehNumber) {
		this.vehName = vehName;
		this.vehNumber = vehNumber;
	}

	public String getVehName() {
		return vehName;
	}

	public void setVehName(String vehName) {
		this.vehName = vehName;
	}

	public String getVehNumber() {
		return vehNumber;
	}

	public void setVehNumber(String vehNumber) {
		this.vehNumber = vehNumber;
	}

	public void acceptVehicle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the vehicle name - ");
		this.vehName = sc.next();
		System.out.print("Enter the vehicle number - ");
		this.vehNumber = sc.next();
	}
	
	public void displayVehicle() {
		System.out.println("Vehicle Details -  ");
		System.out.println("Vehicle Name - "+this.vehName);
		System.out.println("Vehicle Number - "+this.vehNumber);
	}
}
