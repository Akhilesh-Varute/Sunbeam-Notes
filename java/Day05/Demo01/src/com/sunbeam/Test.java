package com.sunbeam;

public class Test {
	final private int field1 = 1001; // field initializer
	final private int field2;
	final private int field3;
	
	// Object initializer
	{
		field2 = 2001;
	}
	
	public Test() {
		field3 = 3001;
	}
	
	public void displayTest() {
		//field1 = 101; //NOT OK
		System.out.println(field1);
		System.out.println(field2);
		System.out.println(field3);

	}
}
