package com.sunbeam;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-21 12:46
 */

public class Demo06Main {
	public static void writeMovies() {
		List<Movie> list = new ArrayList<>();
		list.add(new Movie(1, "Forest Gump", 8.5));
		list.add(new Movie(2, "Star Wars", 9.3));
		list.add(new Movie(3, "Harry Potter", 7.5));
		list.add(new Movie(4, "Intersteller", 6.6));
		list.add(new Movie(5, "Mission Imposible", 9.2));
		
		try(FileOutputStream fout = new FileOutputStream("movies.txt")) {
			try(PrintStream pout = new PrintStream(fout)) {
				for (Movie m : list) {
					pout.printf("%d, %s, %.1f\n", m.getId(), m.getTitle(), m.getRating());
				}
			} // pout.close();
		} // fout.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Movies Saved.");
	}
	public static void main(String[] args) {
		writeMovies();
	}
}








