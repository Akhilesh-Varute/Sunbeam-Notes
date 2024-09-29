package com.sunbeam;

import java.util.Arrays;

public class InsertionSortMain {
	public static void insertionSort(int arr[], int N) {
		//1. Count number of passes
		for(int i = 1 ; i < N ; i++) {
			//2. take backup of one element
			int temp = arr[i];
			//3. find immediate left neighbour
			int j = i - 1;
			//4. compare backued element with all its left neighbour
			while(j >= 0 && arr[j] > temp) {
				//5. if left element is greater than backuped element then move it one position ahead
				arr[j + 1] = arr[j];
				j--;
			}
			// i = 1
			// temp = 44
			// j = 0(55), -1
			//6. insert backuped element at its appropriate position
			arr[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = {55, 44, 22, 66, 11, 33};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}
