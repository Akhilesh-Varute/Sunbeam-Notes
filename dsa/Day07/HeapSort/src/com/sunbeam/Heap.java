package com.sunbeam;

import java.util.Arrays;

public class Heap {
	private int SIZE;
	public Heap() {
		SIZE = 0;
	}
	
	public void addHeap(int arr[]) {
		//1. increase size of heap by 1
		SIZE++;
		//2. add element at first empty position - SIZE index
		//3. find parent of newly added element
		int pi = SIZE / 2;
		//3. compare and adjust position of newly added element upto root node
		while(pi >= 1) {
			//3.1 find index of left child
			int ci = pi * 2;
			//3.2 find maximum child index of pi
			if(ci + 1 <= SIZE && arr[ci + 1] > arr[ci])
				ci = ci + 1;
			//3.3 if parent is greater than maximum child
			if(arr[pi] > arr[ci])
				break;
			//3.4 if parent is less than maximum child
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			//3.5 update index of parent
			pi = pi / 2;
		}
	}
	
	public void delHeap(int arr[]) {
		//1. swap first element(root) and last element of heap
		int max = arr[1];
		arr[1] = arr[SIZE];
		arr[SIZE] = max;
		//2. decrease the size of heap by one
		SIZE--;
		//3. find index of left child
		int ci = 1 * 2;
		//4. compare element which is added at root position with all the below childs
		while(ci <= SIZE) {
			//4.1 find index of parent
			int pi = ci / 2;
			//4.2 find index of maximum child of pi
			if(ci + 1 <= SIZE && arr[ci + 1] > arr[ci])
				ci = ci + 1;
			//4.3 if parent is greater than maximum child
			if(arr[pi] > arr[ci])
				break;
			//4.4 if parent is less than maximum child
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			//4.5 update index of left child
			ci = ci * 2;
		}
		//return max;
	}
	
	public void createHeap(int arr[]){
		for(int i = 1 ; i < arr.length ; i++)
			addHeap(arr);
	}
	
	public void deleteHeap(int arr[]) {
		for(int i = 1 ; i < arr.length ; i++)
			delHeap(arr);
	}
	
	public void heapSort(int arr[]) {
		//1. create heap from given array
		createHeap(arr);
		System.out.println("Heap : " + Arrays.toString(arr));
		//2. delete all elements from array
		deleteHeap(arr);
	}
	

}
