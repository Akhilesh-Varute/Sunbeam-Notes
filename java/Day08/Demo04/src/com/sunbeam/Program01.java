package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		Time t1 = new Time();
		
		try {
			t1.setHours(20);
			t1.setMinutes(50);
			t1.setSeconds(80);
		} catch (InvalidTimeException e) {
			e.printStackTrace();
		}
		
		System.out.println(t1);
	}

}
