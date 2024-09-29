package com.sunbeam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program02 {

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
		catch (ArithmeticException exception) {
			System.out.println("Cannot divide the numerator by 0");
		}
		catch(InputMismatchException exception) {
			System.out.println("Wrong input...");
		}

		System.out.println("Program executed successfully");

	}

}
