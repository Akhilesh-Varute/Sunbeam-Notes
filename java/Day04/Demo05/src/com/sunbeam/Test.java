package com.sunbeam;

public class Test {
	private int num1 = 10; // Field initializers
	private int num2;
	private int num3;
	private int num4;
	
	// object initializers
	{
		System.out.println("Inside Object Initializer-1");
		num2 = 20;
	}
	
	// object initializers
	{
		System.out.println("Inside Object Initializer-2");
		num1 = 100;
		num3 = 30;
	}
	
	public Test() {
		System.out.println("Inside Constructor");
		num1=1000;
		num4 = 40;
	}
	
	public void displayTest() {
		System.out.println("Inside Display");
		System.out.println("Num1 = "+num1);
		System.out.println("Num2 = "+num2);
		System.out.println("Num3 = "+num3);
		System.out.println("Num4 = "+num4);
		
	}
}
