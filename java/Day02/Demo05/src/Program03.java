import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		int choice,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("0. EXIT");
		System.out.println("1. Poitive or Negative Number");
		System.out.println("2. Prime Number");
		System.out.print("Enter your choice");
		choice = sc.nextInt();
		
		switch (choice) {
		case 0:
			System.out.println("thankyou for using app...");
			break;
		case 1:
			System.out.print("Enter the number = ");
			num = sc.nextInt();
			if(num<0)
				System.out.println("Negative Number");
			else
				System.out.println("Positive Number");
			break;
		case 2:
			System.out.print("Enter the number = ");
			num = sc.nextInt();
			int i = 2;
			while(i<num) {
				if(num%i==0) {
					System.out.println("Not a prime number");
					break;
				}
					i++;
			}
			if(i==num) {
				System.out.println("Prime Number");
			}
			
			break;
		default:
			System.out.println("Wrong choice...");
			break;
		}
		
	}

}
