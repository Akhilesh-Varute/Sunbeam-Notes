package com.sunbeam;

import java.util.Objects;

public class Date {
	int day;
	int month;
	int year;
	
	public Date() {
		// TODO Auto-generated constructor stub
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	
	@Override
	public String toString() {
		return this.day+"/"+this.month+"/"+this.year;
	}


	@Override
	public boolean equals(Object obj) {
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	
//	@Override
//	public boolean equals(Object obj) { // d1 ->this , d2-> obj
//		Date d2 = (Date)obj;
//		if(this.day == d2.day && this.month == d2.month && this.year == d2.year)
//		return true;
//			return false;
//	}
	
	

}
