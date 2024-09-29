
public class Program01 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		
		//using traditional for loop
		System.out.println("using Simple For loop");
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		
		// using for each
		System.out.println("Using For each");
		for(int element:arr) {
			System.out.println(element);
		}

	}

}
