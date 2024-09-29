package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {

		Employee e2 = new Employee(1,"e1",10000);
		e2.displayData();
		
		Employee e3 = new Employee();
		e3.acceptData();
		e3.displayData();
	}

}
