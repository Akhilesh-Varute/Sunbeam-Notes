package com.sunbeam;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-25 14:12
 */

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			Thread th = Thread.currentThread();
			System.out.println(th.getName() + " : " + th.getId() + " : " + i);
			Demo02Main.delay(1000);
		}		
	}
}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			Thread th = Thread.currentThread();
			System.out.println(th.getName() + " : " + th.getId() + " : " + i);
			Demo02Main.delay(1000);
		}		
	}
}

public class Demo02Main {
	public static void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start(); // 10 seconds
		
		MyRunnable mr = new MyRunnable();
		Thread t2 = new Thread(mr);
		t2.start(); // 10 seconds

		// main loop - 10 seconds
		for (int i = 1; i <= 10; i++) {
			Thread th = Thread.currentThread();
			System.out.println(th.getName() + " : " + th.getId() + " : " + i);
			delay(1000);
		}		
	}
}
