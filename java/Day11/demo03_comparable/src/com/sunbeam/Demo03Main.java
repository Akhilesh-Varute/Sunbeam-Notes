package com.sunbeam;

import java.util.Arrays;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-17 10:02
 */

public class Demo03Main {
	public static void main(String[] args) {
		Employee[] arr = new Employee[5];
		arr[0] = new Employee(3, "Nilesh", 50000.0);
		arr[1] = new Employee(1, "Sarang", 70000.0);
		arr[2] = new Employee(4, "Vishal", 60000.0);
		arr[3] = new Employee(5, "Prashant", 30000.0);
		arr[4] = new Employee(2, "Nitin", 40000.0);

		System.out.println("Before Sort: ");
		for (Employee e : arr)
			System.out.println(e);

		Arrays.sort(arr);
	
		System.out.println("After Sort: ");
		for (Employee e : arr)
			System.out.println(e);
	}
}













