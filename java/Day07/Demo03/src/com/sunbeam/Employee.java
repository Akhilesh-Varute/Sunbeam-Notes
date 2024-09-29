package com.sunbeam;

public class Employee implements Acceptable,Displayable{
	int empid;
	String name;
	double salary;
	
//	public void acceptEmployee() {
//		System.out.println("Inside Employee acceptEmployee()");
//	}
	
//	public void printEmployee() {
//		System.out.println("Inside Employee printEmployee()");	
//	}
	
	@Override
	public void acceptData() {
		System.out.println("Inside Employee acceptEmployee()");
	}
	@Override
	public void displayData() {
		System.out.println("Inside Employee printEmployee()");	
	}
}
