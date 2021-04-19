/**
 * 
 */
package com.java.hashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yadav Vinod, All the methods of HashMap
 *
 */
public class Student1 {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Prince");
		hashMap.put(2, "Amit");
		hashMap.put(3, "Shaumya");
		hashMap.put(4, "Ayush");
		System.out.println("Initial HashMap: "+hashMap);
		System.out.println();
		
		System.out.println("entrySet() method.");
		System.out.print("Iterate HashMap: ");
		for (Map.Entry m : hashMap.entrySet())
			System.out.print(m.getKey() + "=" + m.getValue() + " ");
		System.out.println();
		
		System.out.print("Iterate HashMap foreach: ");
		hashMap.entrySet().forEach(p->System.out.print(p.getKey()+"="+p.getValue()+" "));
		System.out.println();
		System.out.println();

		System.out.println("putAll() method.");
		Map<Integer, String> hashMap1 = new HashMap<Integer, String>();
		hashMap1.put(5, "Avinash");
		hashMap1.put(6, "Addi");
		hashMap1.put(7, "Anand");
		System.out.println("HashMap first before addAll: " + hashMap);
		hashMap.putAll(hashMap1);
		System.out.println("HashMap first after addAll: " + hashMap);
		System.out.println();

		System.out.println("putIfAbsent() method.");
		System.out.println("Before putIfAbsent: " + hashMap);
		hashMap.putIfAbsent(7, "Anand");
		hashMap.put(8, "Ansh");
		System.out.println("After putIfAbsent: " + hashMap);
		System.out.println();

		System.out.println("remove() method.");
		System.out.println("HashMap before remove 8: " + hashMap);
		hashMap.remove(8);
		System.out.println("HashMap after remove Ansh: " + hashMap);
		System.out.println();

		System.out.println("remove() method.");
		System.out.println("HashMap before remove Addi: " + hashMap);
		hashMap.remove(6, "Addi");
		System.out.println("HashMap after remove Addi: " + hashMap);
		System.out.println();

		System.out.println("keySet() method.");
		System.out.println("Key of hashMap as a set: " + hashMap.keySet());
		System.out.println();

		System.out.println("clear() method.");
		System.out.println("HashMap beofre clear: " + hashMap1);
		hashMap1.clear();
		System.out.println("HashMap after clear: " + hashMap1);
		System.out.println();

		System.out.println("compute() method.");
		System.out.println("HashMap before compute: " + hashMap);
		hashMap.compute(1, (key, val) -> val.concat(" Yadav"));
		System.out.println("HahsMap after compute: " + hashMap);
		System.out.println();

		System.out.println("computeIfAbsent() method.");
		System.out.println("HashMap before computeIfAbsent: " + hashMap);
		hashMap.computeIfAbsent(6, val -> "Addi Yadav");
		System.out.println("HashMap after computeIfAbsent: " + hashMap);
		System.out.println();

		System.out.println("computeIfPresent() method.");
		System.out.println("HashMap before computeIfPresent: " + hashMap);
		hashMap.computeIfPresent(5, (key, val) -> val.concat("Yadav"));
		System.out.println("HashMap after computeIfPresent: " + hashMap);
		System.out.println();

		System.out.println("containsValue() method.");
		System.out.println(hashMap.containsValue("Satish"));
		System.out.println();

		System.out.println("containsKey() method.");
		System.out.println(hashMap.containsKey(5));
		System.out.println();

		System.out.println("equals() method.");
		System.out.println(hashMap.equals(hashMap1));
		System.out.println();

		System.out.println("get() method.");
		System.out.println(hashMap.get(5));
		System.out.println();

		System.out.println("getOrDefault() method.");
		System.out.println(hashMap.getOrDefault(6, "Not Found"));
		System.out.println(hashMap.getOrDefault(10, "Not Found"));
		System.out.println();

		System.out.println("hashCode() method.");
		System.out.println(hashMap.hashCode());
		System.out.println();

		System.out.println("isEmpty() method.");
		System.out.println(hashMap.isEmpty());
		System.out.println();

		System.out.println("replace() method.");
		System.out.println("HashMap before replace: " + hashMap);
		hashMap.replace(7, "Chhathu");
		System.out.println("HashMap after replace: " + hashMap);
	}

}
