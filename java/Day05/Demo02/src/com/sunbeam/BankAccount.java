package com.sunbeam;

public class BankAccount {
	private int accno;
	private String customerName;
	private double balance;
	//private static double roi = 5.5; // field initializer
	private static double roi;
	
	//static block
	static {
		System.out.println("Inside static Block");
		roi = 5.5;
	}
	
	public BankAccount(int accno, String customerName, double balance) {
		System.out.println("Inside Ctor");
		this.accno = accno;
		this.customerName = customerName;
		this.balance = balance;
	}
	
	public void displayAccountDetails() {
		System.out.println("Accno = "+this.accno);
		System.out.println("Name = "+this.customerName);
		System.out.println("Balance = "+this.balance);
		System.out.println("Rate of Intrest= "+roi);
	}
	
	public static void setRoi(double roi) {
		//balance = 10000; // NOT OK
		BankAccount.roi = roi;
	}	
	
}
