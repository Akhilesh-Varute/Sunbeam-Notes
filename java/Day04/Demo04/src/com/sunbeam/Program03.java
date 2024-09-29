package com.sunbeam;

public class Program03 {

	public static void incrementSalary(Employee employee) {
		double newSalary = employee.getSalary() * 2;
		employee.setSalary(newSalary);
	}
	
	public static void main(String[] args) {

		Employee employee = new Employee(1,"e1",10000);
		System.out.println("Before Increment - ");
		employee.displayEmployee();
		
		incrementSalary(employee);
		System.out.println("After Incerement - ");
		employee.displayEmployee();
		
		
		
	}

}
