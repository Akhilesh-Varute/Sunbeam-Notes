package com.sunbeam;

public class Singleton02 {
	private static Singleton02 singleton;
	
	static {
		singleton = new Singleton02();
	}
	
	private Singleton02() {
		System.out.println("Inside Constructor");
	}
	
	public static Singleton02 getSingleton() {
		return singleton;
	}
}
