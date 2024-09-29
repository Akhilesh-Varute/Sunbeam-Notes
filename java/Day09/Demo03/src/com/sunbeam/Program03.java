package com.sunbeam;

import java.util.Scanner;

enum Languages3 {
	EXIT() {
		@Override
		public String toString() {
			return "Go Back";
		}
	},
	C() {
		@Override
		public String toString() {
			return "Add C";
		}
	},
	CPP() {
		@Override
		public String toString() {
			return "Delete CPP";
		}
	},
	JAVA() {
		@Override
		public String toString() {
			return "Select JAVA";
		}
	}
}

public class Program03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Languages3 arr[] = Languages3.values();

		for (int i = 0; i < arr.length; i++)
			System.out.println(i + ". " + arr[i]);

//		System.out.println("0. EXIT");
//		System.out.println("1. Add C");
//		System.out.println("2. Delete CPP");
//		System.out.println("3. Select JAVA");
		System.out.print("Enter your choice - ");

		int choice = sc.nextInt();

		Languages3 languages = arr[choice];
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
