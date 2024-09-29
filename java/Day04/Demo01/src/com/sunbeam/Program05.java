package com.sunbeam;

import com.sunbeam.shapes.Rectangle;


//Ragged Array
public class Program05 {

	public static void main(String[] args) {
		int arr1[][] = new int[2][];
		arr1[0] = new int[3]; // size of second dimension array is 3
		arr1[1] = new int[5]; // size of second dimension array is 5

		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;

		arr1[1][0] = 11;
		arr1[1][1] = 22;
		arr1[1][2] = 33;
		arr1[1][3] = 44;
		arr1[1][4] = 55;

		for (int[] arr : arr1) {
			for (int element : arr)
				System.out.print(element + ",");
			System.out.println();
		}

	}

}


