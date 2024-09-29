package com.sunbeam;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-25 14:47
 */


class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 15; i++) {
			System.out.println("my: " + i);
			Demo04Main.delay(1000);
		}		
	}
}

public class Demo04Main {
	public static void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		MyThread th = new MyThread();
		th.start();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("main : " + i);
			delay(1000);
		}
		
		System.out.println("calling thread (main) is waiting... for completion of given thread (th)...");
		th.join();
		System.out.println("Bye!");
	}

}
