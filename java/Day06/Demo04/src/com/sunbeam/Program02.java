package com.sunbeam;

public class Program02 {

	public static void main(String[] args) {
		//Person person = new Person(); 
		Person person = new Employee(); // upcasting
		person.acceptData();
		person.displayData();
		// person.getSalary();//NOT OK object Slicing

		// if downcasting fails it will throw an exception -> ClassCastException
		// for such non possible downcasting first check for the sub class object that
		// is created or not.
		if (person instanceof Employee) {
			Employee employee = (Employee) person; // Downcasting
			System.out.println("Salary of emp - " + employee.getSalary());
		}
	}

}
