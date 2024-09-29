package com.sunbeam;

import java.io.FileWriter;
import java.nio.charset.Charset;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-21 13:28
 */

public class Demo07Main {
	public static void main(String[] args) {
		String str = "SUNBEAM";
		// Java 11
		try(FileWriter fw = new FileWriter("file.txt", Charset.forName("UTF-16"))) {
			fw.write(str);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("File saved.");
	}
}
