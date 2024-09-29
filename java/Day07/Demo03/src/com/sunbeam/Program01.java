package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		Circle circle = new Circle();
		//circle.accept();
		circle.acceptData();
		//circle.display();
		circle.displayData();
		
		Date date = new Date();
		//date.acceptDate();
		date.acceptData();
		//date.displayDate();
		date.displayData();
			
		Employee employee = new Employee();
		//employee.acceptEmployee();
		employee.acceptData();
		//employee.printEmployee();
		employee.displayData();
	}

}
