package com.sunbeam;

import java.util.Arrays;

public class Program01 {

	public static void main(String[] args) {
		int arr[] = {11,55,33,22,44};
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr, 44));
		
		int arr1[] = {11,55,33,22,44};
		Arrays.sort(arr1);
		System.out.println("arr==arr1 :"+Arrays.equals(arr, arr1));
		
		double arr2[] = {11.22,55.34,33.56,22.78,44.92};
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		

	}

}
