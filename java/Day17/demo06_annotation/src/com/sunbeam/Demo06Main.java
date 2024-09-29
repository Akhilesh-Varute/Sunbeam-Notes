package com.sunbeam;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-23 13:29
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR})
@interface Developer {
	String value();
	String designation() default "Developer";
	String company() default "Sunbeam";
}

@Developer(value="Nilesh", company="Sunbeam", designation="Director")
class MyClass {
	// ...
	@Developer(value="Rahul", company="SunbeamKrd", designation="Sr.Developer")
	private int myField;
	@Developer(value="Pratik", company="SunbeamKrd", designation="Coordinator")
	public void myMethod() {
		//@Developer(value="Pratik", company="SunbeamKrd", designation="Coordinator") // error
		int myVariable = 1;
	}
}

@Developer(value="Prashant")
class YourClass {
	@Developer("Prashant") // by default initialized to "value" field.
	int yourField;
	// ...
}

public class Demo06Main {
	public static void main(String[] args) {
		Class<MyClass> c = MyClass.class;
		Annotation[] anns = c.getAnnotations();
		for(Annotation a : anns)
			System.out.println(a);
	}
}






