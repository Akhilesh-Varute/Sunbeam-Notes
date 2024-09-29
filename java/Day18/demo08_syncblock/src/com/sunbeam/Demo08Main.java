package com.sunbeam;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-25 16:00
 */

public class Demo08Main {
	public static void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		Account acc = new Account(1, "Saving", 20000.0);
		
		class DepositThread extends Thread {
			@Override
			public void run() {
				for(int i=1; i<=10; i++) {
					synchronized (acc) {
						acc.deposit(1000.0);
						System.out.println("Deposit -- balance: " + acc.getBalance());
					}
					delay(200);
				}
			}
		}
		
		class WithdrawThread extends Thread {
			@Override
			public void run() {
				for(int i=1; i<=10; i++) {
					synchronized (acc) {
						acc.withdraw(1000.0);
						System.out.println("Withdraw -- balance: " + acc.getBalance());
					}
					delay(200);
				}
			}
		}
		
		DepositThread dt = new DepositThread();
		WithdrawThread wt = new WithdrawThread();
		dt.start();
		wt.start();
		
		dt.join();
		wt.join();
		
		System.out.println("Final Balance: " + acc.getBalance());
	}
}











