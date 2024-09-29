package com.sunbeaminfo.entity;

public class Manager extends Employee {
	int incentive;
	
	public void displaymanager() {
		System.out.println(empid);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(address);
	}
}
