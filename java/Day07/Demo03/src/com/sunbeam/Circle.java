package com.sunbeam;

 public class Circle implements Acceptable,Displayable,Printable {
	int radius;
	
//	public void accept() {
//		System.out.println("Inside Circle accept()");
//	}
	
//	public void display() {
//		System.out.println("Inside Circle display()");	
//	}

	@Override
	public void acceptData() {
		System.out.println("Inside Circle accept()");	
	}

	@Override
	public void displayData() {
		System.out.println("Inside Circle display()");	
	}
	
}
