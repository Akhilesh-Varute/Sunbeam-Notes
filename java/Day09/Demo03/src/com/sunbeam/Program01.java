package com.sunbeam;

import java.util.Scanner;
enum Languages{
	EXIT,C,CPP,JAVA
}

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Languages arr[] = Languages.values();
		
		System.out.println("0. EXIT");
		System.out.println("1. C");
		System.out.println("2. CPP");
		System.out.println("3. JAVA");
		System.out.print("Enter your choice - ");
	
		int choice = sc.nextInt();
		
		Languages languages = arr[choice];
				switch (languages) {
		case EXIT:
			System.out.println("Bye...");
			break;
		case C:
			System.out.println("Your Selected Favourite Language is C");
			break;
		case CPP:
			System.out.println("Your Selected Favourite Language is CPP");
			break;
		case JAVA:
			System.out.println("Your Selected Favourite Language is JAVA");
			break;

		}
	}

}
