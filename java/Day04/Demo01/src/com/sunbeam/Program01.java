package com.sunbeam;

// Single Dimensional Array
public class Program01 {

	public static void main(String[] args) {

		// int arr1[]; // reference

		// int arr1[] = new int[5];
		/// OR
		int[] arr1 = new int[5];

		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=40;
		arr1[4]=50;
		
		for (int i = 0; i < 5; i++)
			System.out.println("Element at index " + i + " = " + arr1[i]);
	
		int arr2[] = new int[] {11,22,33,44,55};
		for (int i = 0; i < 5; i++)
			System.out.println("Element at index " + i + " = " + arr2[i]);
		
		int arr3[] = {10,20,30,40,50};
			for(int num:arr3)
				System.out.println("Element = "+num);
	}

}
