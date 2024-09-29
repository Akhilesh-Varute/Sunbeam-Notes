package com.sunbeam;

import java.util.StringTokenizer;

public class Program02 {
	public static void main(String[] args) {
		//String s1 = "sunbeam infotech pune";
		//String s1 = "www.sunbeaminfo.com";
		String s1 = "https://www.sunbeaminfo.com/placements";
		System.out.println(s1);
		
		//StringTokenizer str = new StringTokenizer(s1);
		//StringTokenizer str = new StringTokenizer(s1,".");
		//StringTokenizer str = new StringTokenizer(s1,":/.");
		StringTokenizer str = new StringTokenizer(s1,":/.",true);
		
		
		while(str.hasMoreTokens()) {
			String token = str.nextToken();
			System.out.println(token);
		}
	}
}
