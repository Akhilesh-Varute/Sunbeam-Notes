package com.sunbeam;

public class Demo01Main {
	public static void printObjectArray(Object[] arr) {
		System.out.println("Object array:");
		for (Object ele : arr) {
			System.out.println(ele);
		}
	}
	
	public static <T> void printGenericArray(T[] arr) {
		System.out.println("Generic array:");
		for (T ele : arr) {
			System.out.println(ele);
		}
	}
	
	public static void main(String[] args) {
		Object[] arr1 = { 11, 22, 33 };
		printObjectArray(arr1);
		Object[] arr2 = { 1.1, 2.2, 3.3 };
		printObjectArray(arr2);
		Object[] arr3 = { "One", "Two", "Three" };
		printObjectArray(arr3);

		Integer[] arr4 = { 11, 22, 33 };
		printGenericArray(arr4);
		Double[] arr5 = { 1.1, 2.2, 3.3 };
		printGenericArray(arr5);
		String[] arr6 = { "One", "Two", "Three" };
		printGenericArray(arr6);
	}
}
