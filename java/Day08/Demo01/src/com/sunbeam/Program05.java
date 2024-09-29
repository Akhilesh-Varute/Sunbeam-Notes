package com.sunbeam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program05 {

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

		} catch (ArithmeticException | InputMismatchException exception) {
			if (exception instanceof ArithmeticException)
				System.out.println("Cannot divide the numerator by 0");
			else
				System.out.println("Wrong input..:(");
		}
		finally {
			sc.close();
			System.out.println("Resource closed...");
		}

		System.out.println("Program executed successfully");

	}

}
