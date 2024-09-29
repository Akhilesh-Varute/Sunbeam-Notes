package com.sunbeam;

import java.util.Scanner;
enum Languages2{
	EXIT,C,CPP,JAVA
}

public class Program02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Languages2 arr[] = Languages2.values();
	
		for(int i=0 ; i<arr.length ; i++)
			System.out.println(i + ". "+arr[i]);
		
		System.out.println("0. EXIT");
//		System.out.println("1. Add C");
//		System.out.println("2. Delete CPP");
//		System.out.println("3. Select JAVA");
		System.out.print("Enter your choice - ");
	
		int choice = sc.nextInt();
		
		Languages2 languages = arr[choice];
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
