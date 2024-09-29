package com.sunbeam;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Program01 {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);

		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		int tempMonth = calendar.get(Calendar.MONTH) + 1;
		calendar.set(Calendar.MONTH, tempMonth);
		
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int month = calendar.get(Calendar.MONTH);
		int year = calendar.get(Calendar.YEAR);
	
		System.out.println(day+"/"+month+"/"+year);
		
	}

}
