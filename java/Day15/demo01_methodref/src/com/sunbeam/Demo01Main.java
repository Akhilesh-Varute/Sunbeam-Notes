package com.sunbeam;

import java.util.Comparator;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-21 08:22
 */

public class Demo01Main {
	public static void main(String[] args) {
		//Method reference to a "non-static method" called on 1st lambda arg (ClassName::method)
			// the method is called on 1st lambda arg
			// and rest of lambda args are passed to that method as its args
		//Comparator<String> lamdba1 = (a,b) -> a.compareTo(b);
		Comparator<String> lamdba1 = String::compareTo;
		int diff1 = lamdba1.compare("Sunbeam", "Infotech");
		System.out.println("String diff: " + diff1);
		
		//Method reference to a "static method" called on class (ClassName::method)
			// the method is called on the classname
			// and all lambda args are passed to that method as its args
		//Comparator<Double> lambda2 = (a,b) -> Double.compare(a, b);
		Comparator<Double> lambda2 = Double::compare;
		int diff2 = lambda2.compare(2.0, 2.1);
		System.out.println("Double diff: " + diff2);
		
		//Method reference to a non-static method called on an (external) object (obj::method)
			// the method is called on given object
			// and all lambda args are passed to that method as its args
		//Consumer<Integer> lambda3 = x -> System.out.println(x);
		Consumer<Integer> lambda3 = System.out::println;
		lambda3.accept(1234);
	
		//Method reference to constructor (ClassName::new)
			// the object of class is created and param-less constructor of the class is executed
		//Supplier<Date> lambda4 = () -> new Date();
		Supplier<Date> lambda4 = Date::new;
		Date date = lambda4.get();
		System.out.println(date);
	}
}









