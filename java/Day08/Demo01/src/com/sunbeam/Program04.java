package com.sunbeam;

import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numerator;
		int denominator;

		try {
		System.out.print("Enter numerator value - ");
		numerator = sc.nextInt();

		System.out.print("Enter Denominator value - ");
		denominator = sc.nextInt();

		int result = numerator / denominator;

		System.out.println("Division = " + result);
		}
		finally {
			sc.close();
			System.out.println("Resource Closed..");
		}
		System.out.println("Program executed successfully");
		
		
	}

}
