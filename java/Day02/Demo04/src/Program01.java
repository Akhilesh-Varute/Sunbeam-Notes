
public class Program01 {

	public static void main(String[] args) {
	
		short num1 = 10;
		int num2 = num1;  // widening
		
		long num3 = 1234;
		short num4 = (short)num3; // narrowing
		
		boolean status = true;
		//int num5 =(int) status; // NOT allowed

		float num5 = 12.34f;
		int num6 = (int)num5; // narrowing -> Type conversion
	
		byte b = 65;
		char ch = (char)b;// widening  -> Type conversion
	}

}
