package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		Date d1 = new Date(1, 1, 2000);
		Date d2 = d1; // Reference copy

		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		
		d2.day = 2;
		d2.month = 2;
		
		System.out.println("After changes in d2 - ");
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
	}

}
