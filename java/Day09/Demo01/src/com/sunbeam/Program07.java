package com.sunbeam;

public class Program07 {

	public static void main(String[] args) {
		String s1 = "sunbeam";
		String s2 = new String("sunbeam").intern(); // used to convert object into string literal
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("s1==s2 : "+(s1==s2));
		System.out.println("s1.equals(s2) = "+s1.equals(s2));
		

	}

}
