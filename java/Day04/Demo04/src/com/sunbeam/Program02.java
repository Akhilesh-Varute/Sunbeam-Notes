package com.sunbeam;

public class Program02 {

	public static void swap(int []arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1]= temp;
	}
	public static void main(String[] args) {
		
		int arr[] = {10,20};
		
		System.out.println("Before  swapping = ");
		System.out.println("arr[0] = "+arr[0]+", arr[1]= "+arr[1]);
		
		swap(arr);
		
		System.out.println("After  swapping = ");
		System.out.println("arr[0] = "+arr[0]+", arr[1] = "+arr[1]);
		
		
		
	}

}
