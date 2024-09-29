package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-20 09:07
 */

public class Demo03Main {
	public static void main(String[] args) {
		Employee[] arr = new Employee[5];
		arr[0] = new Employee(3, "Nilesh", "Training", 50000.0);
		arr[1] = new Employee(1, "Sarang", "Account", 70000.0);
		arr[2] = new Employee(5, "Prashant", "Account", 30000.0);
		arr[3] = new Employee(4, "Prashant", "Management", 60000.0);
		arr[4] = new Employee(2, "Nitin", "Management", 40000.0);
		
		class EmpIdAscComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = e1.getEmpno() - e2.getEmpno();
				return diff;
			}
		}
		Arrays.sort(arr, new EmpIdAscComparator());
		System.out.println("Employees sorted by id in Asc order: ");
		for (Employee e : arr)
			System.out.println(e);

		Comparator<Employee> nameAscComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = e1.getName().compareTo(e2.getName());
				return diff;
			}
		};
		Arrays.sort(arr, nameAscComparator);
		System.out.println("\nEmployees sorted by Name in Asc order: ");
		for (Employee e : arr)
			System.out.println(e);
		
		Arrays.sort(arr, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = - e1.getName().compareTo(e2.getName());
				return diff;
			}			
		});
		System.out.println("\nEmployees sorted by Name in Desc order: ");
		for (Employee e : arr)
			System.out.println(e);
		
		Arrays.sort(arr, (Employee e1, Employee e2) -> {
							int diff = e1.getDept().compareTo(e2.getDept());
							return diff;
						}			
					);
		System.out.println("\nEmployees sorted by Dept in Asc order: ");
		for (Employee e : arr)
			System.out.println(e);
		
		Arrays.sort(arr, (e1,e2) -> {
					int diff = - e1.getDept().compareTo(e2.getDept());
					return diff;
				}			
			);
		System.out.println("\nEmployees sorted by Dept in Desc order: ");
		for (Employee e : arr)
		System.out.println(e);

		Arrays.sort(arr, (e1,e2) -> {
					return Double.compare(e1.getSalary(), e2.getSalary());
				}			
			);
		System.out.println("\nEmployees sorted by Sal in Asc order: ");
		for (Employee e : arr)
		System.out.println(e);

		Arrays.sort(arr, (e1,e2) -> -Double.compare(e1.getSalary(), e2.getSalary()) );
		System.out.println("\nEmployees sorted by Sal in Desc order: ");
		for (Employee e : arr)
		System.out.println(e);
	}
}








