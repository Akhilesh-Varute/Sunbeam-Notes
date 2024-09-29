
public class Program02 {
	public static void main(String[] args) {
		String choice = "DAI";

		switch (choice) {
		case "DAC":
			System.out.println("Welcome to DAC Course");
			break;
		case "DMC":
			System.out.println("Welcome to DMC Course");
			break;
		case "DBDA":
			System.out.println("Welcome to DBDA Course");
			break;
		case "DESD":
			System.out.println("Welcome to DESD Course");
			break;
		case "DITISS":
			System.out.println("Welcome to DITISS Course");
			break;
		default:
			System.out.println("Wrong choice... ");
			break;
		}
	}
}
