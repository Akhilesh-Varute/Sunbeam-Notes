package com.sunbeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-20 10:41
 */

// step 1: original collection: 1, 2, 3, 4, 9, 8, 7, 6, 5 
// step 2: filter odd nums: 1, 3, 9, 7, 5
// step 3: square each num: 1, 9, 81, 49, 25
// step 4: sort all nums: 1, 9, 25, 49, 81
// step 5: prefix each with "DAC-": DAC-1, DAC-9, DAC-25, DAC-49, DAC-81
// step 6: print all nums

public class Demo05Main {
	/*
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		Collections.addAll(list1, 1, 2, 3, 4, 9, 8, 7, 6, 5);		
		
		List<Integer> list2 = new ArrayList<>();
		for(Integer num:list1) {
			if(num % 2 != 0)
				list2.add(num);
		}
		
		List<Integer> list3 = new ArrayList<>();
		for(Integer num:list2) {
			int result = num * num;
			list3.add(result);
		}
		
		List<Integer> list4 = list3;
		list4.sort((x,y) -> x - y);
		
		List<String> list5 = new ArrayList<>();
		for(Integer num:list4) {
			String result = "DAC-" + num;
			list5.add(result);
		}
		
		for(String ele:list5)
			System.out.println(ele);
	}
	*/
	
	/*
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1, 2, 3, 4, 9, 8, 7, 6, 5);		
		Stream<Integer> strm1 = list.stream();
			// 1, 2, 3, 4, 9, 8, 7, 6, 5
		Stream<Integer> strm2 = strm1.filter(ele -> ele % 2 != 0);
			// 1, 3, 9, 7, 5
		Stream<Integer> strm3 = strm2.map(ele -> ele * ele);
			// 1, 9, 81, 49, 25
		Stream<Integer> strm4 = strm3.sorted((x,y) -> x - y);
			// 1, 9, 25, 49, 81
		Stream<String> strm5 = strm4.map(ele -> "DAC-" + ele);
			// DAC-1, DAC-9, DAC-25, DAC-49, DAC-81
		strm5.forEach(ele -> System.out.println(ele));
	}
	*/
	
	/*
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1, 2, 3, 4, 9, 8, 7, 6, 5);		
		Stream<Integer> strm = list.stream();
		strm
			.filter(ele -> ele % 2 != 0)
			.map(ele -> ele * ele)
			.sorted((x,y) -> x - y)
			.map(ele -> "DAC-" + ele)
			.forEach(ele -> System.out.println(ele));
	}
	*/
	
	/*
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1, 2, 3, 4, 9, 8, 7, 6, 5);		
		Stream<Integer> strm = list.stream();
		strm
			.filter(ele -> {
				System.out.println("filter() -- odd -- " + ele);
				return ele % 2 != 0;
			})
			.map(ele -> {
				System.out.println("map() -- squaring -- " + ele);
				return ele * ele;
			})
			.sorted((x,y) -> {
				System.out.println("sorted() -- comparing -- " + x + ", " + y);
				return x - y;
			})
			.map(ele -> {
				System.out.println("map() -- prefixing -- " + ele);
				return "DAC-" + ele;
			})
			.forEach(ele -> {
				System.out.println("forEach() -- printing -- " + ele);
			});	
		System.out.println("Good bye!");
	}
	*/
	
	/*
	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 3, 5, 6, 7, 8, 9 };
		Stream<Integer> strm1 = Arrays.stream(arr);
		System.out.println("Unique elements: ");
		strm1
			.distinct()
			.forEach(ele -> System.out.println(ele));
		
		System.out.println("\nUnique 5 elements after first 2 elements: ");
		Stream<Integer> strm2 = Stream.of(arr); 
		strm2
			.distinct()
			.skip(2)
			.limit(5)
			.forEach(ele -> System.out.println(ele));
	}
	*/

	/*
	public static void main(String[] args) {
		// stream creation
		//strm1 = collection.stream();
	
		//strm2 = Arrays.stream(arr);
		
		//strm3 = Stream.of(...);
		
//		Random r = new Random();
//		Stream<Integer> strm4 = Stream.generate(() -> r.nextInt(100))
//									.limit(10);
//		strm4.forEach(ele -> System.out.println(ele));
		
//		Stream<Integer> strm5 = Stream.iterate(1, x -> x + 1)
//									.limit(10);
//		strm5.forEach(ele -> System.out.println(ele));
	}
	*/
	
	/*
	public static void main(String[] args) {
		Stream<Integer> strm = Stream.iterate(1, x -> x + 1)
				.limit(6);
		Integer sum = strm.reduce(0, (a,e) -> a + e);
		System.out.println("Sum : " + sum);
	}
	*/
	
	public static void main(String[] args) {
		Random r = new Random();
		
		// Collectors.toList() gives a Collector, which can collect stream elements into a List.
		// That list will be returned by stream.collect().
		Stream<Integer> strm1 = Stream.generate(() -> r.nextInt(10)).limit(10);
		List<Integer> list = strm1.collect( Collectors.toList() );
		System.out.println(list);
		
		// Collectors.toSet() gives a Collector, which can collect stream elements into a Set.
		// That set will be returned by stream.collect().
		Stream<Integer> strm2 = Stream.generate(() -> r.nextInt(10)).limit(10);
		Set<Integer> set = strm2.collect( Collectors.toSet() );
		System.out.println(set);
		
		// Collectors.toMap() gives a Collector, which can collect stream elements into a Map.
		//	toMap() needs to lambdas
		//		1st -- that yields key from current stream element
		//		2nd -- that yields value from current stream element
		// That map will be returned by stream.collect().
		Stream<Integer> strm3 = Stream.iterate(1, x -> x + 1).limit(10);
		Map<Integer, String> map = strm3.collect( Collectors.toMap(x -> x, x -> x % 2 == 0 ? "Even" : "Odd" ) );
		map.forEach((k,v) -> System.out.println(k + " -- " + v));
	}
}













