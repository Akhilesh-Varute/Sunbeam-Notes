package com.sunbeam;

import java.util.Scanner;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-25 14:57
 */

class MyThread extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("my: " + i);
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		
		Thread th = Thread.currentThread();
		System.out.println("Running State: " + th.getState());
		System.out.println("Good Bye!");
	}
}

public class Demo05Main {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		System.out.println("Initial State: " + t1.getState());
		t1.start();
		Scanner sc = new Scanner(System.in);
		System.out.println("Press enter to terminate the thread...");
		sc.nextLine();
		System.out.println("Sleeping State: " + t1.getState());
		//t1.stop();
		t1.interrupt();
		
		System.out.println("Main ends!!");
	}
}
