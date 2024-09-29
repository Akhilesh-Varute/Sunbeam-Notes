package com.sunbeam;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-23 11:56
 */

public class Demo04Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a class name: ");
		String className = sc.nextLine();
		
		Class<?> c = Class.forName(className);
		System.out.println("Name: " + c.getName());
		
		if(c.getSuperclass() != null)
			System.out.println("Superclass: " + c.getSuperclass().getName());
		
		for(Class<?> ic : c.getInterfaces())
			System.out.println("Superinterface: " + ic.getName());
	
		Field[] fields = c.getDeclaredFields();
		for(Field f : fields)
			System.out.println("Field: " + f.toString());
		
		Method[] methods = c.getDeclaredMethods();
		for(Method m : methods)
			System.out.println("Method: " + m.toString());
		
		Constructor<?>[] ctors = c.getDeclaredConstructors();
		for (Constructor<?> ct : ctors)
			System.out.println("Constructor: " + ct.toString());

		Annotation[] anns = c.getDeclaredAnnotations();
		for (Annotation a : anns)
			System.out.println("Annotation: " + a.toString());
	}
}













