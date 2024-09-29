package com.sunbeam;

import com.sunbeam.shapes.Rectangle;

//Ragged Array
public class Program06 {

	public static void main(String[] args) {
		Rectangle [][]arr1 = new Rectangle[2][];
		
		arr1[0] = new Rectangle[2];
		arr1[1] = new Rectangle[3];
		
		arr1[0][0] = new Rectangle();
		arr1[0][1] = new Rectangle(11,6);
		arr1[1][0] = new Rectangle(12,8);
		arr1[1][1] = new Rectangle(15,11);
		arr1[1][2] = new Rectangle();
		
		System.out.println("Using traditional for");
		// Rows -> First dimension of array
		for(int i = 0; i<arr1.length ; i++) {
			// columns -> Second Dimension of array
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j].calculateArea();
			}
		}

		
		System.out.println("Using for-each");
		for(Rectangle[] arr:arr1)
			for(Rectangle rectangle:arr)
				rectangle.calculateArea();
	}

}
