package com.sunbeam;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-21 09:55
 */

public class Demo03Main {
	public static void main(String[] args) {
		String srcFilePath = "/home/nilesh/delete.jpg";
		String destFilePath = "/home/nilesh/del.jpg";
		int b;
		// open source file for reading
		try(FileInputStream fin = new FileInputStream(srcFilePath)) {
			// open destination file for writing
			try(FileOutputStream fout = new FileOutputStream(destFilePath)) {
				// read a byte from source file
				while( (b = fin.read()) != -1 ) {
					// write that byte into destination file
					fout.write(b);
				} // repeat above 2 steps until end of source file
			} // fout.close();		// close destination file
		} // fin.close();	// close source file
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("File copied.");
	}
	
	/*
	public static void main(String[] args) throws Exception {
		String srcFilePath = "/home/nilesh/delete.jpg";
		String destFilePath = "/home/nilesh/del.jpg";
		int b;
		// open source file for reading
		FileInputStream fin = new FileInputStream(srcFilePath);
		// open destination file for writing
		FileOutputStream fout = new FileOutputStream(destFilePath);
		// read a byte from source file
		while( (b = fin.read()) != -1 ) {
			// write that byte into destination file
			fout.write(b);
		} // repeat above 2 steps until end of source file
		// close destination file
		fout.close();
		// close source file
		fin.close();
		System.out.println("File copied.");
	}
	*/
}
