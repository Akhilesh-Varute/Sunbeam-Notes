package com.sunbeam;

public class Program {

	public static void main(String[] args) {

		// Employee employee = new Manager(); // upcasting
		Employee employee = new SalesMan(); // upcasting

		employee.acceptData();
		employee.displayData();

		if (employee instanceof Manager) {
			Manager manager = (Manager) employee; // downcasting
			manager.calculateTotalSalary();
		}

		if (employee instanceof SalesMan) {
			SalesMan salesMan = (SalesMan) employee; // downcasting
			salesMan.calculateTotalCommission();
		}
	}

}
