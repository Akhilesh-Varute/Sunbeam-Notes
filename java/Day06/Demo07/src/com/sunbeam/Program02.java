package com.sunbeam;

public class Program02 {

	public static void main(String[] args) {
		Date d1 = new Date(1,1,2000);
		Date d2 = new Date(1,1,2000);
		//Date d2 = d1;

		if(d1==d2) // == checks the equality of references
			System.out.println("Date is equal");
		else
			System.out.println("Date is not equal");
		
		if(d1.equals(d2)) // equals() checks the equality of objects
			System.out.println("Date is equal");
		else
			System.out.println("Date is not equal");
	
	}
}
