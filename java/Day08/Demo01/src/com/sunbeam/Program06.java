package com.sunbeam;

import java.util.Scanner;

public class Program06 {

	public static void main(String[] args) {
		
		int numerator;
		int denominator;

		try(Scanner sc = new Scanner(System.in)) // try-with-resource
		{
		System.out.print("Enter numerator value - ");
		numerator = sc.nextInt();

		System.out.print("Enter Denominator value - ");
		denominator = sc.nextInt();

		int result = numerator / denominator;

		System.out.println("Division = " + result);
		}
		
		System.out.println("Program executed successfully");
		
		
	}

}
