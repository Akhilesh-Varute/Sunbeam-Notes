
public class Program02 {

	public static void main(String[] args) {
		int num1 = 10; // value type
		
		Integer i1; // reference type
		i1 = Integer.valueOf(num1); // Boxing
		
		Integer i2 = num1; // Auto-Boxing
		
		Integer i3 = new Integer(20);
		int num2 = i3.intValue(); // unboxing
		
		int num3 = i3; // auto unboxing

	}

}
