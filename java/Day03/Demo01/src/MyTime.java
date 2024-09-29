import java.util.Scanner;


class MyTime{
	int hours;
	int minutes;
	
	void acceptTime() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the hours = ");
		hours = sc.nextInt();
		
		System.out.print("Enter the minutes = ");
		minutes = sc.nextInt();
	}
	
	void displayTime() {
		System.out.println("Time = "+hours+" : "+minutes);
	}
};