package com.sunbeam;

import java.lang.reflect.Method;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-23 12:26
 */

public class ReflectionMiddleware {
	public static Object callMethod(String className, 
								String methodName, Class<?> argTypes[], Object argValues[]) {
		try {
			// load the class
			Class<?> c = Class.forName(className);
			// create object of the class
			Object obj = c.newInstance();
			// find the method with given name and arg types
			Method m = c.getDeclaredMethod(methodName, argTypes);
			// ensure that method is accessible (even if it is private)
			m.setAccessible(true);
			// call the method on created object and collect result
			Object result = m.invoke(obj, argValues);
			// return result
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
