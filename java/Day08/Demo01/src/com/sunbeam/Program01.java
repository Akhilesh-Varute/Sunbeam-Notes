package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		int result= 0;
		try {
		result = 10 / 0;
		System.out.println("Division = "+result);
		}
		catch(ArithmeticException exception) {
			System.out.println("Cannot divide the numerator by 0");
		}
		
		System.out.println("Program executed successfully");

	}

}
