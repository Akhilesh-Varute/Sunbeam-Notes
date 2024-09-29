
public class Program03 {

	public static void main(String[] args) {
		
		System.out.println("size of int in bits = "+Integer.SIZE);
		System.out.println("size of int in bytes = "+Integer.SIZE/8);
		System.out.println("max value of int = "+Integer.MAX_VALUE);
		System.out.println("min value of int = "+Integer.MIN_VALUE);
	
		int result = Integer.sum(10, 20);
		System.out.println("Addition = "+result);
	
	}

}
