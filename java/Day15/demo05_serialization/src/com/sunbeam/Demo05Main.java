package com.sunbeam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-21 11:53
 */

public class Demo05Main {
	public static void writeMovies() {
		List<Movie> list = new ArrayList<>();
		list.add(new Movie(1, "Forest Gump", 8.5));
		list.add(new Movie(2, "Star Wars", 9.3));
		list.add(new Movie(3, "Harry Potter", 7.5));
		list.add(new Movie(4, "Intersteller", 6.6));
		list.add(new Movie(5, "Mission Imposible", 9.2));
		
		try(FileOutputStream fout = new FileOutputStream("movies.db")) {
			try(ObjectOutputStream oout = new ObjectOutputStream(fout)) {
				oout.writeObject(list);
			} // oout.close();
		} // fout.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Movies saved.");
	}
	public static void readMovies() {
		List<Movie> list;
		try(FileInputStream fin = new FileInputStream("movies.db")) {
			try(ObjectInputStream oin = new ObjectInputStream(fin)) {
				list = (List<Movie>) oin.readObject();
				list.forEach(m -> System.out.println(m));
			}
		} // fin.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//writeMovies();
		readMovies();
	}
}

























