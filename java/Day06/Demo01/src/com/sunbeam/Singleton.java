package com.sunbeam;

public class Singleton {
	private static Singleton singleton = null;
	
	private Singleton() {
		System.out.println("Inside Constructor");
	}
	
	public static Singleton getInstance() {
		if(singleton==null)
			singleton = new Singleton();
		return singleton;
	}
}
