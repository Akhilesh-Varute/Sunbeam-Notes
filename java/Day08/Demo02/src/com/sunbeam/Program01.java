package com.sunbeam;

// demo to understand checked exception
public class Program01 {
	public static void main(String[] args) {
		
		try {
			for (int i = 1; i <= 10; i++) {
				new Thread().sleep(1000); // It throws an checked exception
				System.out.println(i);
			}
			int result = 10/0; // unchecked exception
			System.out.println("Division = "+result);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		}

	}

}
