package com.sunbeam;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-18 13:00
 */

public class Demo09Main {
	public static void main(String[] args) {
		/*
		// Elements are stored as per Natural Ordering (Comparable)
		Queue<Integer> q1 = new PriorityQueue<>();
		q1.offer(33);
		q1.offer(55);
		q1.offer(11);
		q1.offer(44);
		q1.offer(22);
		while(!q1.isEmpty()) {
			Integer e = q1.poll();
			System.out.println("Popped: " + e);
		}
		*/
		
		class IntDescComparator implements Comparator<Integer> {
			@Override
			public int compare(Integer i1, Integer i2) {
				int diff = -Integer.compare(i1, i2);
				return diff;
			}
		}
		IntDescComparator cmp = new IntDescComparator();
		// Elements are stored as per given Comparator
		Queue<Integer> q2 = new PriorityQueue<>(cmp);
		q2.offer(33);
		q2.offer(55);
		q2.offer(11);
		q2.offer(44);
		q2.offer(22);
		while(!q2.isEmpty()) {
			Integer e = q2.poll();
			System.out.println("Popped: " + e);
		}
	}
}





