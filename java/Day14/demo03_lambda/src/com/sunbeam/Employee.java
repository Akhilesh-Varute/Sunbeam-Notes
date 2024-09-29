package com.sunbeam;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-20 09:08
 */

public class Employee {
	private int empno;
	private String name;
	private String dept;
	private double salary;
	public Employee() {
	}

	public Employee(int empno, String name, String dept, double salary) {
		this.empno = empno;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
}

