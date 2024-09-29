package com.sunbeam;

import java.lang.reflect.Method;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-23 12:24
 */

public class Demo05Main {
	public static void main(String[] args) {
		/*
		Class<Arithmetic> c = Arithmetic.class;
		Method[] methods = c.getDeclaredMethods();
		for(Method m : methods)
			System.out.println(m);
		*/

		//Object dtString = ReflectionMiddleware.callMethod("java.util.Date", "toString", null, null);
		//System.out.println(dtString);
		
//		Object addRes = ReflectionMiddleware.callMethod("com.sunbeam.Arithmetic", 
//										"add",
//										new Class[] { Integer.class, Integer.class },
//										new Object[] { 22, 7 }
//									);
//		System.out.println("Add Result: " + addRes);

		Object multiplyRes = ReflectionMiddleware.callMethod("com.sunbeam.Arithmetic", 
										"multiply",
										new Class[] { Integer.class, Integer.class },
										new Object[] { 22, 7 }
									);
		System.out.println("Multiply Result: " + multiplyRes);

	}
}
















