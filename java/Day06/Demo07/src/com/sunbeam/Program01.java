package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		Date date = new Date(1,1,2000);
		System.out.println("Date - "+date);
		// Date - com.sunbeam.Date@3764951d -> Before overriding toString()
		// Date - 1/1/2000 -> After overriding toString()
	}

}
