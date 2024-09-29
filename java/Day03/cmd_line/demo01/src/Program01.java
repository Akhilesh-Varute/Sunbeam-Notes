import java.util.Scanner;

class Time {
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
		System.out.println("Time = " + hours + " : " + minutes);
	}
};

class Program {

	public static void main(String[] args) {
		Time t1 = null; // reference
		// t1.acceptTime(); // NullPointerException
		// t1.displayTime();// NullPointerException

		Time t2 = new Time(); // object
		t2.acceptTime();
		t2.displayTime();
	}

}
