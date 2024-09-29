package com.sunbeam;

// Multi Dimensional Array (2D)
public class Program02 {

	public static void main(String[] args) {

		int arr1[][] = new int[2][3];

		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		arr1[1][0] = 40;
		arr1[1][1] = 50;
		arr1[1][2] = 60;

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 3; j++)
				System.out.println("Element at arr1[" + i + "][" + j + "] = " + arr1[i][j]);

		int[][] arr2 = new int[][] { { 11, 22, 33 }, { 44, 55, 66 } };
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 3; j++)
				System.out.println("Element at arr2[" + i + "][" + j + "] = " + arr2[i][j]);

		int arr3[][] = { { 11, 22, 33 }, { 44, 55, 66 } };
		
		for (int[] arr : arr3) {
			for (int element : arr)
				System.out.print(element + ",");
		System.out.println(); // go to the next line
		}
		
	}

}
