package com.sunbeam;

public class Date implements Acceptable,Displayable {
	int day;
	int month;
	int year;
	
//	public void acceptDate() {
//		System.out.println("Inside Date acceptDate()");
//	}
	
//	public void displayDate() {
//		System.out.println("Inside Date displayDate()");
//	}
	
	@Override
	public void acceptData() {
		System.out.println("Inside Date acceptDate()");	
	}
	
	@Override
	public void displayData() {
		System.out.println("Inside Date displayDate()");
	}
}
