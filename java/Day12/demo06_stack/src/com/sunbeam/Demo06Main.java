package com.sunbeam;

import java.util.Stack;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-18 11:59
 */

public class Demo06Main {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(11);
		s.push(22);
		s.push(33);
		s.push(44);
		s.push(55);
		while(! s.isEmpty()) {	
			Integer ele = s.pop();
			System.out.println("Popped: " + ele); // 55, 44, 33, 22, 11
		}
	}
}
