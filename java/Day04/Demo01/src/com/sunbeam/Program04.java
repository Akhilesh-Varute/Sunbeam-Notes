package com.sunbeam;

import com.sunbeam.shapes.Rectangle;

public class Program04 {

	public static void main(String[] args) {


		Rectangle arr1[][] = new Rectangle[2][3];
	
		arr1[0][0] = new Rectangle();
		arr1[0][1] = new Rectangle(10,3);
		arr1[0][2] = new Rectangle(20,5);
		arr1[1][0] = new Rectangle(18,9);
		arr1[1][1] = new Rectangle();
		arr1[1][2] = new Rectangle(22,15);
		
		for(Rectangle []arr:arr1)
			for(Rectangle rectangle:arr)
				rectangle.calculateArea();
	
	}

}
