/**
 * 
 */
package com.java.simpleExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Yadav Vinod
 *
 */
public class Student2 {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Sohan");
		arrList.add("Satish");
		arrList.add("Saloni");
		arrList.add("Shreya");
		arrList.add("Ansh");
		System.out.println("ArrayList before remove Ansh: " + arrList);
		arrList.removeIf(p -> p.contains("Ansh"));
		System.out.println("ArrayList after remove Ansh: " + arrList);
		System.out.println();

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Avinash");
		map.put(102, "Addi");
		map.put(103, "Anand");
		map.put(104, "Saloni");
		map.put(105, "Shreya");
		System.out.println("Initial Map: " + map);
		System.out.println();

		System.out.println("comparing by key and reverse order: ");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(System.out::println);

		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(p -> System.out.print(p.getKey() + "=" + p.getValue() + ", "));
		System.out.println();

		System.out.println("comparing by value and reverse order: ");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::println);

		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(p -> System.out.print(p.getKey() + "=" + p.getValue() + ", "));
		System.out.println();
		
		System.out.println("Map before compute."+map);
		map.compute(101, (key, val)->val.concat(" Yadav"));
		System.out.println("Map after compute."+map);
		

	}
}
