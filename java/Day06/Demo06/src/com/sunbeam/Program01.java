package com.sunbeam;

final class Parent{
	public void method1() {
		System.out.println("Inside A::method-1");
	}
	final public void method2() {
		System.out.println("Inside A::method-2");
	}
}

class Child extends Parent{
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		super.method1();
	}
	
}


public class Program01 {

	public static void main(String[] args) {
	

	}

}
