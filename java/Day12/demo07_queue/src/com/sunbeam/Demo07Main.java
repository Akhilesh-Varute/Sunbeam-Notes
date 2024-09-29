package com.sunbeam;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-18 12:18
 */

public class Demo07Main {
	public static void main(String[] args) {
		/*
		// offer(), poll(), peek() returns null in case of failure.
		//Queue<Integer> q1 = new LinkedList<Integer>();
		Queue<Integer> q1 = new ArrayDeque<Integer>();
		q1.offer(11);
		q1.offer(22);
		q1.offer(33);
		q1.offer(44);
		System.out.println("Topmost: " + q1.peek()); // 11
		while(!q1.isEmpty()) {
			Integer e = q1.poll();
			System.out.println("Popped: " + e);
		}
		System.out.println("Try Pop: " + q1.poll()); // null
		*/
		
		// add(), remove(), element() throws exception in case of failure.
		//Queue<Integer> q2 = new LinkedList<Integer>();
		Queue<Integer> q2 = new ArrayDeque<Integer>();
		q2.add(11);
		q2.add(22);
		q2.add(33);
		q2.add(44);
		System.out.println("Topmost: " + q2.element()); // 11
		while(!q2.isEmpty()) {
			Integer e = q2.remove();
			System.out.println("Popped: " + e);
		}
		System.out.println("Try Pop: " + q2.remove()); // throw NoSuchElementException
	}
}
