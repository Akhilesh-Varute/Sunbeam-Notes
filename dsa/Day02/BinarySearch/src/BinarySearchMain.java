import java.util.Scanner;

public class BinarySearchMain {
	
	public static int binarySearch(int arr[], int left, int right, int key) {
		//1. stop if partition is invalid
		if(left > right)
			return -1;
		
		//2. find middle element of array
		int mid = (left + right)/2;
		//3. compare key with middle element
		if(key == arr[mid])
			return mid;		// if key is found
		else if(key < arr[mid])
			// if key is less than middle element, search it into left sub array
			return binarySearch(arr, left, mid - 1, key);	
		else
			// if key is greater than middle element, search it into right sub array
			return binarySearch(arr, mid + 1, right, key);
	}

	public static void main(String[] args) {
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 88};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int index = binarySearch(arr, 0, arr.length-1, key);
		if(index != -1)
			System.out.println("Key is found at index : " + index);
		else
			System.out.println("Key is not found");
		sc.close();

	}

}
