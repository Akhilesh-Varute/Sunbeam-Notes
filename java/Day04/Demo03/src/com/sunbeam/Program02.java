package com.sunbeam;

public class Program02 {

	public static void add(int num1, int num2) {
		System.out.println("Addition = " + (num1 + num2));
	}

	public static void add(int num1, int num2,int num3) {
		System.out.println("Addition = " + (num1 + num2 +num3));
	}

	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
	}

}
