package com.sunbeam;

import java.util.Arrays;

public class MergeSortMain {
	public static void mergeSort(int arr[], int left, int right) {
		//1. stop if partition contains single element
		if(left == right)
			return;
		//2. find mid of array
		int mid = (left + right) / 2;
		//3. sort both partitions individually
		//3.1 call mergeSort on left partition
		mergeSort(arr, left, mid);
		//3.2 call mergeSort on right partition
		mergeSort(arr, mid + 1, right);
		//4. merge sorted partitions into temp array
		//4.1  create temp array
		int size = (right - left) + 1;
		int temp[] = new int[size];
		int i = left, j = mid + 1, k = 0;
		//4.2 merge both sorted partitions into temp array
		while(i <= mid && j <= right) {
			/*
			if(arr[i] < arr[j]) {
				temp[k] = arr[i];
				i++;
				k++;
			}
			else {
				temp[k] = arr[j];
				j++;
				k++;
			}
			*/
			temp[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
		}
		//4.3 if right partition is finished, add all remaining elements of left partition into temp
		while(i <= mid) {
			//temp[k] = arr[i];
			//i++;
			//k++;
			
			temp[k++] = arr[i++];
		}
		//4.3 if left partition is finished, add all remaining elements of right partition into temp
		while(j <= right) {
			//temp[k] = arr[j];
			//j++;
			//k++;
			
			temp[k++] = arr[j++];
		}
		//4.4 overwrite temp array into original array
		for(i = 0 ; i < size ; i++)
			arr[left + i] = temp[i];
	}

	public static void main(String[] args) {
		int arr[] = {6, 3, 9, 1, 7, 2, 8, 4, 5};
		
		System.out.println("Before Array : " + Arrays.toString(arr));
		mergeSort(arr, 0, arr.length-1);
		System.out.println("After Array : " + Arrays.toString(arr));
	}

}
