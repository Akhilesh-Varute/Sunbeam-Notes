package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		//final int num1 = 10;
		// OR
		
		final int num1;		
		num1 = 10;
		
		//num1 = 20;// NOT OK
		
	
		final Test test = new Test();
		test.displayTest();
		
		//test = new Test(); NOT OK

	}

}
