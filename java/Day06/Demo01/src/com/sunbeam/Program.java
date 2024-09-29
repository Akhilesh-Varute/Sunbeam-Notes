package com.sunbeam;

public class Program {

	public static void main(String[] args) {
	
		Singleton singleton1 = Singleton.getInstance();
		
		Singleton singleton2 = Singleton.getInstance();
		
		Singleton singleton3 = Singleton.getInstance();
		
		Singleton02 singleton4 = Singleton02.getSingleton();
		
		Singleton02 singleton5 = Singleton02.getSingleton();
		
		Singleton02 singleton6 = Singleton02.getSingleton();

	}

}
