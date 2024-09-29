package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-21 10:49
 */

public class Demo04Main {
	public static void writeMovies() {
		List<Movie> list = new ArrayList<>();
		list.add(new Movie(1, "Forest Gump", 8.5));
		list.add(new Movie(2, "Star Wars", 9.3));
		list.add(new Movie(3, "Harry Potter", 7.5));
		list.add(new Movie(4, "Intersteller", 6.6));
		list.add(new Movie(5, "Mission Imposible", 9.2));
		
		try(FileOutputStream fout = new FileOutputStream("movies.bin")) {
			try(DataOutputStream dout = new DataOutputStream(fout)) {
				for(Movie m : list) {
					dout.writeInt(m.getId());
					dout.writeDouble(m.getRating());
					dout.writeUTF(m.getTitle());
				}
			} // dout.close();
		} // fout.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Movies saved.");
	}
	
	public static void readMovies() {
		try(FileInputStream fin = new FileInputStream("movies.bin")) {
			try(DataInputStream din = new DataInputStream(fin)) {
				while(true) {
					Movie m = new Movie();
					m.setId( din.readInt() );
					m.setRating( din.readDouble() );
					m.setTitle( din.readUTF() );
					System.out.println(m);
				}
			} // din.close();
		} // fin.close();
		catch (EOFException e) {
			// do nothing
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//writeMovies();
		readMovies();
	}
}











