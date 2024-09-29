package com.sunbeam;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-25 16:35
 */

//synchronized -- SUNBEAM INFOTECH -- only one will execute at a time
// inter-thread communication
// INFOTECH should wait() and SUNBEAM should notify() it after completion.
//SUNBEAM execute before INFOTECH
public class Demo09Main {
	public static void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception {
		Object obj = new Object();
		
		class SunbeamThread extends Thread {
			@Override
			public void run() {
				String str = "SUNBEAM\n";
				synchronized (obj) {
					for (int i = 0; i < str.length(); i++) {
						System.out.print(str.charAt(i));
						System.out.flush();
						delay(400);
					}
					obj.notify();
				}
				// additional work to be done by SunbeamThread.
			}
		}
		
		class InfotechThread extends Thread {
			@Override
			public void run() {
				String str = "INFOTECH\n";
				synchronized (obj) {
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					for (int i = 0; i < str.length(); i++) {
						System.out.print(str.charAt(i));
						System.out.flush();
						delay(400);
					}					
				}
			}
		}

		SunbeamThread st = new SunbeamThread();
		InfotechThread it = new InfotechThread();
		it.start();
		st.start();
		
		st.join();
		it.join();
		
		System.out.println("Bye!");
	}
}

/*
// synchronized -- SUNBEAM INFOTECH -- only one will execute at a time
public class Demo09Main {
	public static void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception {
		Object obj = new Object();
		
		class SunbeamThread extends Thread {
			@Override
			public void run() {
				String str = "SUNBEAM\n";
				synchronized (obj) {
					for (int i = 0; i < str.length(); i++) {
						System.out.print(str.charAt(i));
						System.out.flush();
						delay(400);
					}					
				}
			}
		}
		
		class InfotechThread extends Thread {
			@Override
			public void run() {
				String str = "INFOTECH\n";
				synchronized (obj) {
					for (int i = 0; i < str.length(); i++) {
						System.out.print(str.charAt(i));
						System.out.flush();
						delay(400);
					}					
				}
			}
		}

		SunbeamThread st = new SunbeamThread();
		InfotechThread it = new InfotechThread();
		it.start();
		st.start();
		
		st.join();
		it.join();
		
		System.out.println("Bye!");
	}
}
*/

/*
// SUNBEAM INFOTECH -- with no synchronization
public class Demo09Main {
	public static void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception {
		class SunbeamThread extends Thread {
			@Override
			public void run() {
				String str = "SUNBEAM\n";
				for (int i = 0; i < str.length(); i++) {
					System.out.print(str.charAt(i));
					System.out.flush();
					delay(400);
				}
			}
		}
		
		class InfotechThread extends Thread {
			@Override
			public void run() {
				String str = "INFOTECH\n";
				for (int i = 0; i < str.length(); i++) {
					System.out.print(str.charAt(i));
					System.out.flush();
					delay(400);
				}
			}
		}

		SunbeamThread st = new SunbeamThread();
		InfotechThread it = new InfotechThread();
		st.start();
		it.start();
		
		st.join();
		it.join();
		
		System.out.println("Bye!");
	}
}
*/