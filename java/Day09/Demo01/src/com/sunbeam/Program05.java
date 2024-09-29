package com.sunbeam;

public class Program05 {

	public static void main(String[] args) {
		String s1 = "sunbeam";
		String s2 = "sun" + "beam"; // constant literals gets resolved at compile time
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("s1==s2 : "+(s1==s2));
		System.out.println("s1.equals(s2) = "+s1.equals(s2));
		

	}

}
