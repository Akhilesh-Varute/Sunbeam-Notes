import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		int rollno;
		String name;
		double marks;

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter rollno = ");
		rollno = scanner.nextInt();
				
		System.out.print("Enter name = ");
		name = scanner.next();
		
		System.out.print("Enter marks = ");
		marks = scanner.nextDouble();
		
		
		System.out.println("Roll No = "+rollno);
		System.out.println("Name = "+name);
		System.out.println("Marks = "+marks);
		
	}

	
}
