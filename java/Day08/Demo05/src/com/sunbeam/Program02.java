package com.sunbeam;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Program02 {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int month = calendar.get(Calendar.MONTH) + 1;
		int year = calendar.get(Calendar.YEAR);
		
		LocalDate localDate2 = LocalDate.of(year, month, day);
		System.out.println(localDate2);
		
	}

}
