package com.sunbeam;

import java.util.Objects;

class Date {
	int day;

	public Date(int day) {
		this.day = day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + "]";
	}

//	@Override
//	public int hashCode() {
//		return super.hashCode();
//	}

	@Override
	public int hashCode() {
		return Objects.hash(day);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if(obj==null)
//			return false;
//		if(this==obj)
//			return true;
//		if(!(obj instanceof Date))
//			return false;
//		Date d2 = (Date) obj;
//		if (this.day == d2.day)
//			return true;
//		return false;
//	}

}

class Box{
	
}

public class Program {

	public static void main(String[] args) {
		Date d1 = new Date(1);
		// Date d2 = d1;
		Date d2 = new Date(28);
		Box b = new Box();

		System.out.println("d1 - " + d1);
		System.out.println("d2 - " + d2);
		
		System.out.println("d1 hashcode- " + d1.hashCode());
		System.out.println("d2 hashcode- " + d2.hashCode());

		if (d1 == d2) // references are getting checked
			System.out.println("date is equal");
		else
			System.out.println("date is not equal");

		if (d1.equals(d2)) // references are getting checked
			System.out.println("date is equal");
		else
			System.out.println("date is not equal");

	}

}
