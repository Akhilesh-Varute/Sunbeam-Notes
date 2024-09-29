package com.sunbeam;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public void setDay(int day)  {
		if(day<1 || day>31 )
			throw new InvalidDateException();
		this.day = day;
	}
	public void setMonth(int month) {
		if(month<1 || month>12)
				throw new InvalidDateException("month", month);
		this.month = month;
	}
	public void setYear(int year) {
		if(year<1970 || year>2099)
			throw new RuntimeException("Year should be 1970 and 2099",new InvalidDateException("year",year));// Exception Chaning
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
	
}
