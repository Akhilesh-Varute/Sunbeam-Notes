
public class Program03 {
	
	public static void main(String args) {
		System.out.println("main() with string data");
	}
	
	public static void main() {
		System.out.println("main() without parameters");
	}
	
	public static void main(String[] args) {
		System.out.println("main() Program03");
		main("sunbeam");
		main();
	}
}
