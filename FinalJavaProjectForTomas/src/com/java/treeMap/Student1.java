/**
 * 
 */
package com.java.treeMap;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Yadav Vinod, all the methods of TreeMap
 *
 */
public class Student1 {
	public static void main(String[] args) {
		SortedMap<Integer, String> sortMap = new TreeMap<Integer, String>();
		sortMap.put(1, "Avinash");
		sortMap.put(2, "Addi");
		sortMap.put(3, "Anand");
		sortMap.put(4, "Saloni");
		sortMap.put(5, "Shreya");

		NavigableMap<Integer, String> navigMap = new TreeMap<Integer, String>();
		sortMap.put(101, "Amit");
		sortMap.put(102, "Ayush");
		sortMap.put(103, "Shumya");
		sortMap.put(104, "Prince");
		sortMap.put(105, "Ansh");

		SortedMap<Integer, String> synSortMap = Collections.synchronizedSortedMap(new TreeMap<Integer, String>());
		NavigableMap<Integer, String> synNavMap = Collections.synchronizedNavigableMap(new TreeMap<Integer, String>());
		Runnable runnable1 = () -> {
			synchronized (synSortMap) {
				synSortMap.putAll(sortMap);
				System.out.println("Set Head at 4th: " + synSortMap.headMap(4));
				System.out.println("Set Tail at 2nd: " + synSortMap.tailMap(2));
			}
			synchronized (synNavMap) {
				synNavMap.putAll(navigMap);
				System.out.println("Set Head at 104th: " + synNavMap.headMap(104, true));
				System.out.println("Set Tail at 102th: " + synNavMap.tailMap(102, false));
			}
		};
		System.out.println("Sorted map before thread start: " + synSortMap);
		System.out.println("Navigable map before thread start: " + synNavMap);
		System.out.println();
		Thread th1 = new Thread(runnable1);
		th1.start();
		try {
			th1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Sorted map after thread start: " + synSortMap);
		System.out.println("Navigable map after thread start: " + synNavMap);
		System.out.println();

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		System.out.println("put() method");
		tm.put(1, "Avinsh");
		tm.put(2, "Addi");
		tm.put(3, "Anand");
		tm.put(4, "Saloni");
		tm.put(5, "Shreya");
		tm.put(7, "Shaumya");
		System.out.println("Initial TreeMap: " + tm);

		System.out.println("ceilingEntry() method");
		System.out.println("Entry at 5th: " + tm.ceilingEntry(5));
		System.out.println("Entry at 6th: " + tm.ceilingEntry(6));
		System.out.println();

		System.out.println("K ceilingKey() method");
		System.out.println("Key at 5th: " + tm.ceilingKey(5));
		System.out.println("Key at 6th: " + tm.ceilingKey(6));
		System.out.println();

		System.out.println("clone() method");
		TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>();
		System.out.println("TreeMap before clone: " + tm1);
		tm1 = (TreeMap<Integer, String>) tm.clone();
		System.out.println("TreeMap second after clone: " + tm1);
		System.out.println();

		System.out.println("descendingKeySet() method");
		NavigableSet navSet = tm.descendingKeySet();
		System.out.println("Set of keys of treemap: " + navSet);
		System.out.println();

		System.out.println("descendingMap() method");
		NavigableMap navMap = tm.descendingMap();
		System.out.println(navMap);
		System.out.println();

		System.out.println("firstEntry() method");
		System.out.println(tm.firstEntry());
		System.out.println();

		System.out.println("floorEntry() method");
		System.out.println(tm.floorEntry(4));
		System.out.println(tm.floorEntry(6));
		System.out.println();

		System.out.println("headMap() method");
		System.out.println(tm.headMap(3));
		System.out.println();

		System.out.println("headMap() method");
		System.out.println(tm.headMap(3, true));
		System.out.println();

		System.out.println("higherEntry() method");
		System.out.println(tm.higherEntry(5));
		System.out.println(tm.higherEntry(4));
		System.out.println();

		System.out.println("higherKey() method");
		System.out.println(tm.higherKey(4));
		System.out.println(tm.higherKey(5));

		System.out.println("keySet() method");
		System.out.println("Key Set: " + tm.keySet());
		System.out.println();

		System.out.println("lastEntry() method");
		System.out.println(tm.lastEntry());
		System.out.println();

		System.out.println("lowerEntry() method");
		System.out.println(tm.lowerEntry(5));
		System.out.println(tm.lowerEntry(7));
		System.out.println();

		System.out.println("lowerKey() method");
		System.out.println(tm.lowerKey(5));
		System.out.println(tm.lowerKey(7));
		System.out.println();

		System.out.println("navigableKeySet() method");
		System.out.println(tm.navigableKeySet());
		System.out.println();

		System.out.println("pollFirstEntry() method");
		System.out.println(tm.pollFirstEntry());
		System.out.println();

		System.out.println("pollLastEntry() method");
		System.out.println(tm.pollLastEntry());
		System.out.println();

		System.out.println("putAll() method");
		TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>();
		tm2.put(8, "Amit");
		tm2.put(9, "Ayush");
		tm2.put(10, "Chhathu");
		System.out.println("TreeMap before putAll: " + tm);
		tm.putAll(tm2);
		System.out.println("TreeMap after putAll: " + tm);
		System.out.println();

		System.out.println("replace() method");
		tm.replace(9, "Ansh");
		System.out.println("TreeMap after replace: " + tm);

		System.out.println("replace() method");
		tm.replace(10, "Chhathu", "Amit");
		System.out.println("TreMap after Chhathhu replace: " + tm);
		System.out.println();

		System.out.println("subMap() method");
		NavigableMap<Integer, String> tm4 = new TreeMap<Integer, String>();
		tm4 = tm.subMap(1, true, 5, true);
		System.out.println(tm4);
		System.out.println();

		System.out.println("subMap() method");
		SortedMap<Integer, String> smap = new TreeMap<Integer, String>();
		smap = tm.subMap(1, 5);
		System.out.println(smap);
		System.out.println();

		System.out.println("tailMap() method");
		System.out.println(tm.tailMap(5));
		System.out.println();

		System.out.println("tailMap() method");
		System.out.println(tm.tailMap(5, false));

		System.out.println("containsKey() method");
		System.out.println(tm.containsKey(5));
		System.out.println(tm.containsKey(10));
		System.out.println(tm.containsKey(15));
		System.out.println();

		System.out.println("containsValue() method");
		System.out.println(tm.containsValue("Avinash"));
		System.out.println(tm.containsValue("Saloni"));
		System.out.println(tm.containsValue("Akash"));
		System.out.println();

		System.out.println("firstKey() method");
		System.out.println("First Key: " + tm.firstKey());
		System.out.println();

		System.out.println("get() method");
		System.out.println(tm.get(5));
		System.out.println();

		System.out.println("lastKey() method");
		System.out.println(tm.lastKey());

	}
}
