package com.sunbeaminfo;

import java.io.IOException;

public class Program01 {

	public static void main(String[] args) //throws IOException // routing the exceptions from main towards JVM is a bad practice
	{
		Time t1 = new Time();
		try {
			t1.setHours(26);
			t1.setMinutes(50);
			t1.setSeconds(70);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		catch (RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println(t1);
	}

}
