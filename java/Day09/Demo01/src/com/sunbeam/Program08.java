package com.sunbeam;

public class Program08 {

	public static void main(String[] args) {
		String s1 = new String("sunbeam").intern();
		String s2 = new String("sunbeam").intern(); // used to convert object into string literal
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("s1==s2 : "+(s1==s2));//true
		System.out.println("s1.equals(s2) = "+s1.equals(s2));
		

	}

}
