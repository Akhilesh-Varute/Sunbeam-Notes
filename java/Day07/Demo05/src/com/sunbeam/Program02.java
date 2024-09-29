package com.sunbeam;

public class Program02 {

	public static void main(String[] args)throws Exception {
		Date d1 = new Date(1, 1, 2000);
		Date d2 = (Date)d1.clone(); 

		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		
		d2.day = 2;
		d2.month = 2;
		
		System.out.println("After changes in d2 - ");
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
	}

}
