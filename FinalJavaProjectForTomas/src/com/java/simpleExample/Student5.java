/**
 * 
 */
package com.java.simpleExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Yadav Vinod, synchronizedMap(), synchronizedSortedMap()
 *
 */
public class Student5 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Sohan");
		map.put(2, "Satish");
		map.put(3, "Saloni");
		map.put(4, "Shreya");
		map.put(5, "Ansh");
		Map<Integer, String> map1 = Collections.synchronizedMap(new HashMap<Integer, String>());
		Runnable runnable1 = () -> {
			map1.putAll(map);
		};
		Thread th1 = new Thread(runnable1);
		th1.start();
		try {
			th1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(map1);
		System.out.println();

		List<Integer> intList = new ArrayList<Integer>();
		List<String> strList = new ArrayList<String>();
		SortedMap<Integer, String> synSorMap = Collections.synchronizedSortedMap(new TreeMap<>());
		Runnable runnable2 = () -> {
			synchronized (map1) {
				synSorMap.putAll(map1);
				intList.addAll(map1.keySet());
				strList.addAll(map1.values());
			}
		};
		Thread th3 = new Thread(runnable2);
		th3.start();
		try {
			th3.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("SortedMap from map: " + synSorMap);
		System.out.println("Keys of Map in a List: " + intList);
		System.out.println("Values of Map in a List: " + strList);
	}
}
