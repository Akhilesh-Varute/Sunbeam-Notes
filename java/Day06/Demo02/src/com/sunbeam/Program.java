package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.displayEmployee();
		
		Employee employee2 = new Employee(1,"e1",10000,1,2,2003);
		employee2.displayEmployee();
		
		Employee employee3 = new Employee();
		employee3.acceptEmployee();
		employee3.displayEmployee();
	
		//Vehicle vehicle = new Vehicle("abc","1234");
		//OR
		Vehicle vehicle = new Vehicle();
		vehicle.acceptVehicle();
		
		Employee employee4 = new Employee(3,"e3",30000,2,3,2004,vehicle);
		employee4.displayEmployee();
	}

}
