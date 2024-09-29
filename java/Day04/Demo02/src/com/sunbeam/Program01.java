package com.sunbeam;

public class Program01 {

	// variable arity method
	public static void add(int... args) {
		int result = 0;

		// for (int num : args)
		// result += num;

		for (int i = 0; i < args.length; i++)
			result += args[i];

		System.out.println("Addition = " + result);
	}

	public static void main(String[] args) {
		add(10, 20);
		add(10, 20, 30);
		add(10, 20, 30, 40);

		int[] arr = { 10, 20, 30, 40, 50 };
		add(arr);

		add(new int[] { 10, 20, 30, 40, 50, 60 });

	}

}
