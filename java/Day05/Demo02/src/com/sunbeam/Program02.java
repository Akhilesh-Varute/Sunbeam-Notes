package com.sunbeam;

//import com.sunbeam.test.Test;

//OR
//import static com.sunbeam.test.Test.method2;
//import static com.sunbeam.test.Test.method3;

//OR
import static com.sunbeam.test.Test.*;

public class Program02 {
	
	public static void method1() {
		System.out.println("Inside static method - 1");
	}
	
	public static void main(String[] args) {
		method1();
		
		//Test.method2(); // before static import
		//OR
		method2(); // after static import
		
		//Test.method3(); // before static import
		// OR
		method3(); // after static import
	}

}
