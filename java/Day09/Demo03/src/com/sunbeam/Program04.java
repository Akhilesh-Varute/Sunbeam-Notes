package com.sunbeam;

import java.util.Scanner;

enum Languages4 {
	EXIT(0) {
		@Override
		public String toString() {
			return "Go Back";
		}
	},
	C(8) {
		@Override
		public String toString() {
			return "Add C";
		}
	},
	CPP(9) {
		@Override
		public String toString() {
			return "Delete CPP";
		}
	},
	JAVA(10) {
		@Override
		public String toString() {
			return "Select JAVA";
		}
	};
	
	private int field;
	private Languages4(int field) {
		this.field = field;
	}
	
	public int getField() {
		return field;
	}
}

public class Program04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Languages4 arr[] = Languages4.values();

		for (int i = 0; i < arr.length; i++)
			System.out.println(i + ". " + arr[i] + ", Rating - "+arr[i].getField());

//		System.out.println("0. EXIT");
//		System.out.println("1. Add C");
//		System.out.println("2. Delete CPP");
//		System.out.println("3. Select JAVA");
		System.out.print("Enter your choice - ");

		int choice = sc.nextInt();

		Languages4 languages = arr[choice];
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
