package com.sunbeam;

public class Program {

	public static void main(String[] args) {
	
		Employee employee;
		
		//employee= new Employee(); // NOT OK -> Cannot Cretae object of abstract class
		//employee= new Manager(); // upcasting
		employee= new Salesman(); // upcasting
		
		employee.acceptData();
		employee.displayData();
		//employee.calculateTotalSalary();
		
		System.out.println(employee);

	}

}
