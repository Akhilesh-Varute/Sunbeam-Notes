package com.sunbeam;

// demo to understand checked exception
public class Program02 {
	public static void main(String[] args) {
		
		try {
			for (int i = 1; i <= 10; i++) {
				new Thread().sleep(1000); // It throws an checked exception
				System.out.println(i);
			}
			int result = 10/0; // unchecked exception
			System.out.println("Division = "+result);
			
		} catch (Exception e) // Generic Catch Block
		{
			e.printStackTrace();
			//System.err.println("Something went wrong ...");
		}
		System.out.println("Program executed successfully...");
	}

}
