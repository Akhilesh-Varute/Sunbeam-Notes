package com.sunbeaminfo.test;

import com.sunbeaminfo.entity.Employee;

public class Tester {

	public static void main(String[] args) {
		Employee employee = new Employee();

		System.out.println(employee.empid);
		System.out.println(employee.name);
		System.out.println(employee.salary);
		System.out.println(employee.address);
	}

}
