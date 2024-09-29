package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-17 10:57
 */

public class Demo04Main {
	public static void main(String[] args) {
		Employee[] arr = new Employee[5];
		arr[0] = new Employee(3, "Nilesh", 50000.0);
		arr[1] = new Employee(1, "Sarang", 70000.0);
		arr[2] = new Employee(4, "Prashant", 60000.0);
		arr[3] = new Employee(5, "Prashant", 30000.0);
		arr[4] = new Employee(2, "Nitin", 40000.0);

		System.out.println("Before Sort: ");
		for (Employee e : arr)
			System.out.println(e);
		
		// sort by empno -- Comparable
		Arrays.sort(arr);
	
		System.out.println("After Sort by Empno: ");
		for (Employee e : arr)
			System.out.println(e);
		
		// local class
		class EmpNameComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = e1.getName().compareTo(e2.getName());
				return diff;
			}
		}
		
		// sort by name -- Comparator
		EmpNameComparator nameComparator = new EmpNameComparator();
		Arrays.sort(arr, nameComparator);
		System.out.println("After Sort by Name: ");
		for (Employee e : arr)
			System.out.println(e);	
		
		// local class
		class EmpSalAscComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = Double.compare(e1.getSalary(), e2.getSalary());
				return diff;
			}
		}
		
		// sort by sal -- Comparator
		EmpSalAscComparator salAscComparator = new EmpSalAscComparator();
		Arrays.sort(arr, salAscComparator);
		System.out.println("After Sort by Sal Asc: ");
		for (Employee e : arr)
			System.out.println(e);	
		
		// local class
		class EmpSalDescComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = - Double.compare(e1.getSalary(), e2.getSalary());
				return diff;
			}
		}
		
		// sort by sal -- Comparator
		EmpSalDescComparator salDescComparator = new EmpSalDescComparator();
		Arrays.sort(arr, salDescComparator);
		System.out.println("After Sort by Sal Desc: ");
		for (Employee e : arr)
			System.out.println(e);
		
		// local class
		class EmpNameSalComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = e1.getName().compareTo(e2.getName());
				if(diff == 0)
					diff = Double.compare(e1.getSalary(), e2.getSalary());
				return diff;
			}
		}
		EmpNameSalComparator comparator = new EmpNameSalComparator();
		Arrays.sort(arr, comparator);
		System.out.println("After Sort by Name, Sal: ");
		for (Employee e : arr)		
			System.out.println(e);
	}

}




