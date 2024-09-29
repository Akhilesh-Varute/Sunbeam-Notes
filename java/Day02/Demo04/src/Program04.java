
public class Program04 {

	public static void main(String[] args) {		
		if(args.length == 2) {
		System.out.println(args[0]);
		System.out.println(args[1]);

		int num1 = Integer.valueOf(args[0]);
		int num2 = Integer.valueOf(args[1]);
		
		//System.out.println("Addition = "+(args[0]+args[1]));
		System.out.println("Addition = "+(num1+num2));
		}
		else
			System.out.println("Invalid No of Arguments...Please provide 2 arguments only");
	}

}
