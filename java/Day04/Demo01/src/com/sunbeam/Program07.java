package com.sunbeam;

public class Program07 {
	public static void main(String[] args) {
		
		//int []arr = new int [-5]; // NegativeArraySizeException
		
		int []arr = {10,20,30,40,50};
		
		System.out.println(arr[0]);
		
		System.out.println(arr[-1]); // ArrayIndexOutOfBoundsException
		
		System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
		
	}
}
