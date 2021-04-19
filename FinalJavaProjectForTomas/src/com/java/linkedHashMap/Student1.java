/**
 * 
 */
package com.java.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Yadav Vinod, All the methods of linkedHashSet
 *
 */
public class Student1 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(1, "A");
		lhm.put(2, "B");
		lhm.put(3, "C");
		lhm.put(4, "D");
		lhm.put(5, "E");
		System.out.println("Initial Liked HashMap: " + lhm);

		System.out.println(" entrySet() method.");
		for (Map.Entry m : lhm.entrySet())
			System.out.print(m.getKey() + "=" + m.getValue() + " ");
		System.out.println();
		System.out.println();

		System.out.println("Key-Value pair method.");
		System.out.println("keySet, valueSet and entrySet");
		System.out.println(lhm.keySet());
		System.out.println(lhm.values());
		System.out.println(lhm.entrySet());
		System.out.println();

		System.out.println("get() meyhod.");
		System.out.println(lhm.get(1));
		System.out.println(lhm.get(2));
		System.out.println(lhm.get(3));
		System.out.println();

		System.out.println("containsValue() method.");
		if (lhm.containsKey(1))
			System.out.println("We found first key: ");
		else
			System.out.println("We didn't find first key: ");
		if (lhm.containsValue("A"))
			System.out.println("We found value value A ");
		else
			System.out.println("We didn't find value A");
		System.out.println();

		System.out.println("getOrDefault() method.");
		System.out.println(lhm.getOrDefault(2, "D"));
		System.out.println();

		System.out.println(" replaceAll() method");
		lhm.replaceAll((key, val) -> "H");
		System.out.println(lhm);
	}
}
