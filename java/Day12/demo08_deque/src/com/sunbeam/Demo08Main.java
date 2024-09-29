package com.sunbeam;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-18 12:41
 */

public class Demo08Main {
	public static void main(String[] args) {
		/*
		// Deque as Queue (FIFO)
		Deque<Integer> q = new ArrayDeque<Integer>();
		q.offerLast(11);
		q.offerLast(22);
		q.offerLast(33);
		q.offerLast(44);
		System.out.println("Topmost: " + q.peekFirst()); // 11
		while(!q.isEmpty()) {
			Integer e = q.pollFirst();
			System.out.println("Popped: " + e);
		}
		*/
		
		// Deque as Stack (LIFO)
		Deque<Integer> q = new ArrayDeque<Integer>();
		q.offerFirst(11);
		q.offerFirst(22);
		q.offerFirst(33);
		q.offerFirst(44);
		System.out.println("Topmost: " + q.peekFirst()); // 44
		while(!q.isEmpty()) {
			Integer e = q.pollFirst();
			System.out.println("Popped: " + e);
		}
	}
}
