package com.sunbeam;

import java.util.Arrays;

public class SelectionSortMain {
	
	public static void selectionSort(int arr[], int N) {
		//1. count number of passes
		for(int i = 0 ; i < N - 1 ; i++) {
			//2. select one position from array - i
			//3. compare ith element with all other elements(right side)
			for(int j = i + 1 ; j < N ; j++) {
				//3.1 if selected element is greater than other element then swap
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
	}

	public static void main(String[] args) {
		int arr[] = {44, 11, 55, 22, 66, 33};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));
		selectionSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}
