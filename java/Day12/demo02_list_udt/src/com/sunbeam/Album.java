package com.sunbeam;

import java.util.Scanner;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-18 09:02
 */

public class Album {
	private int id;
	private String title;
	private String artist;
	private double price;
	private int tracks;
	public Album() {
	}
	public Album(int id, String title, String artist, double price, int tracks) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.tracks = tracks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getTracks() {
		return tracks;
	}
	public void setTracks(int tracks) {
		this.tracks = tracks;
	}
	public void accept(Scanner sc) {
		System.out.print("Enter id: ");
		this.id = sc.nextInt();
		sc.nextLine(); // skips \n in input buffer
		System.out.print("Enter title: ");
		this.title = sc.nextLine();
		System.out.print("Enter artist: ");
		this.artist = sc.nextLine();
		System.out.print("Enter tracks: ");
		this.tracks = sc.nextInt();		
		System.out.print("Enter price: ");
		this.price = sc.nextDouble();
	}
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof Album) {
			Album other = (Album) obj;
			if(this.id == other.id)
				return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Album [id=" + id + ", title=" + title + ", artist=" + artist + ", price=" + price + ", tracks=" + tracks
				+ "]";
	}
}
