package com.sunbeam;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-19 11:09
 */

public class Demo04Main {
	public static void main(String[] args) {
		//Map<Integer, String> map = new HashMap<>();
		//Map<Integer, String> map = new LinkedHashMap<>();
		//Map<Integer, String> map = new TreeMap<>();
		Map<Integer, String> map = new Hashtable<>(); // Legacy class since 1.0
		
        map.put(400027, "Byculla Mumbai"); // returns null
        map.put(411046, "Katraj Pune"); // returns null
        map.put(411052, "Hinjawadi Pune"); // returns null
        map.put(415110, "Karad Satara"); // returns null
        map.put(411037, "Marketyard Pune"); // returns null
        map.put(411002, "Bajirao Rd Pune"); // returns null
        map.put(411007, "Aundh Pune"); // returns null
        map.put(411007, "Aundh Area Pune"); // duplicate key is not allowed.
        	// new value corresponding to key will overwrite/replace old value.
			// returns "Aundh, Pune" (old value)
        
        System.out.println("Map Size: " + map.size());
        
        Set<Integer> keys = map.keySet();
        System.out.println("Keys: " + keys);
        
        Collection<String> values = map.values();
        System.out.println("Values: " + values);
        
        Set<Entry<Integer,String>> entries = map.entrySet();
        for(Entry<Integer,String> entry : entries) {
        	System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
        
        System.out.println(map.toString());
        
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pin: ");
        Integer pin = sc.nextInt();
        String area = map.get(pin);
        if(area == null)
        	System.out.println("Pin code Not found.");
        else
        	System.out.println("Pin code of " + area);
        */
	}
}

