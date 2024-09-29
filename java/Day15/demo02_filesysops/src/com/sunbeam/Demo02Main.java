package com.sunbeam;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-21 08:54
 */

/*
 * Input a path from the user.
 * If path doesn't exists, then give error and exit.
 * If path is of directory, then list its contents.
 * If path is of file, then display its information (name, length, permissions, ...)
 * If path is not of file/directory, then give error.
 * 
 * */
public class Demo02Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a path: ");
		String path = sc.nextLine();
		File file = new File(path);
		if(! file.exists()) {
			System.out.println("Path doesn't exists.");
			System.exit(1);
		}
		if(file.isDirectory()) {
			String[] list = file.list();
			for (String f : list)
				System.out.println(f);
		}
		else if(file.isFile()) {
			System.out.println("Name: " + file.getName());
			System.out.println("Size: " + file.length() + " bytes");
			Date modTime = new Date(file.lastModified());
			System.out.println("Modification Time: " + modTime);
			System.out.println("Is Readable: " + file.canRead());
			System.out.println("Is Writeable: " + file.canWrite());
			System.out.println("Is Executable: " + file.canExecute());
		}
		else
			System.out.println("Neither file nor directory.");
	}
}








