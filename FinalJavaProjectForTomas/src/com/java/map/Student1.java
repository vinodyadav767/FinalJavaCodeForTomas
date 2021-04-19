/**
 * 
 */
package com.java.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yadav Vinod, all the methods for map
 *
 */
public class Student1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		System.out.println("put() method.");
		map.put(1, "Sohan");
		map.put(2, "Satish");
		map.put(3, "Saloni");
		map.put(4, "Shreya");
		System.out.println(map);

		System.out.println("Iterate map");
		System.out.println("entrySet() method");
		for (Map.Entry m : map.entrySet())
			System.out.print(m.getKey() + "=" + m.getValue() + "");
		System.out.println();
		System.out.println();

		System.out.println("putAll() method");
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(5, "Avinash");
		map1.put(6, "Addi");
		map1.put(7, "Anand");
		System.out.println("Map first before addAll: " + map);
		map.putAll(map1);
		System.out.println("Map first after addAll: " + map);
		System.out.println();

		System.out.println("putIfAbsent() method");
		System.out.println("Before putIfAbsent: " + map);
		map.putIfAbsent(7, "Anand");
		map.put(8, "Ansh");
		System.out.println("After putIfAbsent: " + map);
		System.out.println();

		System.out.println("remove() method");
		System.out.println("Map before remove 8: " + map);
		map.remove(8);
		System.out.println("Map after remove Ansh: " + map);
		System.out.println();

		System.out.println("remove() method.");
		System.out.println("Map before remove Addi: " + map);
		map.remove(6, "Addi");
		System.out.println("Map after remove Addi: " + map);
		System.out.println();

		System.out.println("keySet() method.");
		System.out.println("Key of map as a set: " + map.keySet());
		System.out.println();

		System.out.println("clear() method");
		System.out.println("Map beofre clear: " + map1);
		map1.clear();
		System.out.println("Map after clear: " + map1);
		System.out.println();

		System.out.println("compute() method");
		System.out.println("Map before compute: " + map);
		map.compute(1, (key, val) -> val.concat("Yadav"));
		System.out.println("Map after compute: " + map);
		System.out.println();

		System.out.println("computeIfAbsent() method");
		System.out.println("Map before computeIfAbsent: " + map);
		map.computeIfAbsent(6, val -> "Addi Yadav");
		System.out.println("Map after computeIfAbsent: " + map);
		System.out.println();

		System.out.println("computeIfPresent() method");
		System.out.println("Map before computeIfPresent: " + map);
		map.computeIfPresent(5, (key, val) -> val.concat("Yadav"));
		System.out.println("Map after computeIfPresent: " + map);
		System.out.println();

		System.out.println("containsValue() method");
		System.out.println(map.containsValue("Satish"));
		System.out.println();

		System.out.println("containsKey() method");
		System.out.println(map.containsKey(5));
		System.out.println();

		System.out.println("equals() method");
		System.out.println(map.equals(map1));
		System.out.println();

		System.out.println("get() method");
		System.out.println(map.get(5));
		System.out.println();

		System.out.println("getOrDefault() method()");
		System.out.println(map.getOrDefault(6, "Not Found"));
		System.out.println(map.getOrDefault(10, "Not Found"));
		System.out.println();

		System.out.println("hashCode() method");
		System.out.println(map.hashCode());
		System.out.println();

		System.out.println("isEmpty() method");
		System.out.println(map.isEmpty());
	}

}
