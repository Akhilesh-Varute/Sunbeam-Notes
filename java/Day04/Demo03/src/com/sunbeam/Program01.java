package com.sunbeam;

public class Program01 {

	public static void multiply(int num1,double num2) {
		System.out.println("Multiplication = "+(num1*num2));
	}
	
	public static void multiply(double num1,int num2) {
		System.out.println("Multiplication = "+(num1*num2));
	}

	public static void main(String[] args) {
		multiply(5,10.2);
		multiply(5.45,11);
	}

}
