package com.sunbeam;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-25 12:57
 */

public class Demo01Main {
	public static void main(String[] args) throws Exception {
		System.out.println("main() started!");
		Runtime rt = Runtime.getRuntime();
		//String[] programArgs = { "program to execute", "program args", ... }; // command-line args 
		String[] programArgs = { "/usr/bin/firefox", "sunbeaminfo.in"}; 
		Process pr = rt.exec(programArgs);
		int status = pr.waitFor();
		System.out.println("Firefox exit status: " + status);
		System.out.println("main() completed!");
	}

}



