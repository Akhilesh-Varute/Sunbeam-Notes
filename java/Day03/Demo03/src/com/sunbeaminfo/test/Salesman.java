package com.sunbeaminfo.test;

import com.sunbeaminfo.entity.Employee;

public class Salesman extends Employee {
	int comm;
	
	public void displaySalesman() {
		System.out.println(empid);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(address);
	}
}
