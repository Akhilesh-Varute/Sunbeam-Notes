package com.sunbeam;

import java.util.function.BinaryOperator;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-20 09:50
 */

public class Demo04Main {
	public static void calc(Double a, Double b, BinaryOperator<Double> op) {
		Double r = op.apply(a, b);
		
		System.out.println("Result: " + r);
	}
	public static void main(String[] args) {
		double x = 2.1, y = 4.3, z = 1.5;
		
		calc(x, y, (t,u) -> t + u);		// non-capturing lambda

		calc(x, y, (t,u) -> t + u + z);	// capturing lambda
	}
}








