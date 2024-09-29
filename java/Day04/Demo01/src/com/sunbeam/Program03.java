package com.sunbeam;

import com.sunbeam.shapes.Rectangle;

public class Program03 {

	public static void main(String[] args) {

//		Rectangle rectangle = null;
//		rectangle.calculateArea();

		Rectangle arr1[] = new Rectangle[5];
		arr1[0] = new Rectangle();
		arr1[1] = new Rectangle(20, 10);
		arr1[2] = new Rectangle();
		arr1[3] = new Rectangle(22, 12);
		arr1[4] = new Rectangle(15, 8);

		for (int i = 0; i < 5; i++)
			arr1[i].calculateArea();

		Rectangle[] arr2 = new Rectangle[] { new Rectangle(), new Rectangle(20, 10), new Rectangle(),
				new Rectangle(22, 12), new Rectangle(15, 8) };

		for(Rectangle rectangle : arr2)
			rectangle.calculateArea();
	}

}
