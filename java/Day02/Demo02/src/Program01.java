import java.io.Console;

// Will  not work with STS (with any ide)
// It should be executed from the command line
public class Program01 {

	public static void main(String[] args) {
		String name;
		String mobile;
		
		Console console = System.console();
		
		System.out.print("Enter name = ");
		name = console.readLine();
		
		System.out.print("Enter mobile = ");
		mobile = console.readLine();
		
		System.out.println("Name = "+name);
		System.out.println("Mobile = "+mobile);

	}

}
