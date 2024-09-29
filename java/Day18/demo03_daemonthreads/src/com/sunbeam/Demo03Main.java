package com.sunbeam;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-25 14:34
 */

class FirstThread extends Thread {
	public void run() {
		for (int i = 1; i <= 15; i++) {
			System.out.println("first : " + i);
			Demo03Main.delay(1000);
		}				
	}
}

class SecondThread extends Thread {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("second : " + i);
			Demo03Main.delay(1000);
		}						
	}
}

public class Demo03Main {
	public static void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// non-daemon thread
		FirstThread t1 = new FirstThread();
		t1.start();
		
		// daemon thread
		SecondThread t2 = new SecondThread();
		t2.setDaemon(true); // background thread
		t2.start();
		
		// main thread -- created by jvm -- non-daemon thread
		for (int i = 1; i <= 10; i++) {
			System.out.println("main : " + i);
			delay(1000);
		}		
	}
}



