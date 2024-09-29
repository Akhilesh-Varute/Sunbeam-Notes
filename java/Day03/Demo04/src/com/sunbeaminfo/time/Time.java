package com.sunbeaminfo.time;

import java.util.Scanner;

public class Time {
	private int hours;
	private int minutes;
	
	public Time() {
		this(10,10); // constructor chaining
		System.out.println("Inside Parameterless");
		
	}
	
	
	public Time(int hours, int minutes) {
		System.out.println("Inside Parameterized");
		this.hours = hours;
		this.minutes = minutes;
	}

	public void acceptTime()  // accept(this)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the hours = ");
		this.hours = sc.nextInt();
		System.out.print("Enter the minutes = ");
		minutes = sc.nextInt();
		
	}
	
	public void displayTime() {
		System.out.println("Time = "+hours+" : "+this.minutes);
	}


	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}


	public int getMinutes() {
		return minutes;
	}


	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	
			
			
}
