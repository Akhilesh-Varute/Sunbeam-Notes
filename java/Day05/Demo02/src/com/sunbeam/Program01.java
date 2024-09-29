package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount(1, "c1", 10000);
		BankAccount acc2 = new BankAccount(2, "c2", 20000);
		
		acc1.displayAccountDetails();
		acc2.displayAccountDetails();
		
		//acc1.setRoi(6.5); // misleading information -> Should be avoided
		BankAccount.setRoi(6.5);
	}

}
