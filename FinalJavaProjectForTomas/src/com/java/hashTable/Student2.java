/**
 * 
 */
package com.java.hashTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author Yadav Vinod, All the method()s of HashTable
 *
 */
public class Student2 {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		System.out.println("Put Method.");
		ht.put(1, "Sohan");
		ht.put(2, "Satish");
		ht.put(3, "Saloni");
		ht.put(4, "Shreya");

		System.out.println("entrySet method().");
		System.out.print("Elements of Hashtable: ");
		for (Map.Entry m : ht.entrySet()) {
			System.out.print(m.getKey() + " " + m.getValue() + " ");
		}
		System.out.println();
		System.out.println("Initially Hashtable :" + ht);

		System.out.print("HashTable foreach: ");
		ht.entrySet().forEach(p -> System.out.print(p.getKey() + "=" + p.getValue() + " "));
		System.out.println();
		System.out.println();

		System.out.println("PutAll method()");
		Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
		ht1.put(5, "Avinash");
		ht1.put(6, "Aditya");
		ht1.put(7, "Anand");
		System.out.println("HT first before adding HS second: " + ht);
		System.out.println("HT second initially: " + ht1);
		ht.putAll(ht1);
		System.out.println("HT first after adding HS second: " + ht);
		System.out.println();

		System.out.println("putIfAbsent method()");
		System.out.println("HT before putIfAbsent: " + ht);
		ht.putIfAbsent(8, "Amit");
		System.out.println("HT after putIfAbsent: " + ht);
		ht.putIfAbsent(8, "Amit");
		System.out.println("HT after putIfAbsent again with same key: " + ht);
		System.out.println();

		System.out.println("remove method() with key");
		System.out.println("HT before remove: " + ht);
		ht.remove(8);
		System.out.println("HT after remove: " + ht);
		System.out.println();

		System.out.println("remove method() with key and values");
		System.out.println("HT before remove: " + ht);
		ht.remove(6, "Aditya");
		System.out.println("HT after remove: " + ht);
		System.out.println();

		System.out.println("Clear method(): ");
		System.out.println("HT second before clear: " + ht1);
		ht1.clear();
		System.out.println("HT second after clear: " + ht1);
		System.out.println();

		System.out.println("Clone method() ");
		System.out.println("HT Second before clone" + ht1);
		ht1 = (Hashtable<Integer, String>) ht.clone();
		System.out.println("HT after clone: " + ht1);
		System.out.println();

		System.out.println("getOrDefault method()");
		System.out.println(ht.getOrDefault(4, "Not Found"));
		System.out.println(ht.getOrDefault(8, "Not Found"));
		System.out.println();

		System.out.println("hashCode method() ");
		System.out.println("hashCode of HT first: " + ht.hashCode());
		System.out.println();

		System.out.println("replace method() with key and values");
		System.out.println("HT before replace: " + ht);
		ht.replace(7, "Aditya");
		System.out.println("HT after replace: " + ht);
		System.out.println();

		System.out.println("replace with key oldvalue, value");
		System.out.println("HT before replace: " + ht);
		ht.replace(7, "Aditya", "Anand");
		System.out.println("HT after replace: " + ht);
		System.out.println();

		System.out.println("contains method() for values only: ");
		System.out.println(ht);
		System.out.println(ht.contains("Shreya"));
		System.out.println();

		System.out.println("containsValue method()");
		System.out.println(ht.containsValue("Shreya"));
		System.out.println(ht.containsValue("Amit"));
		System.out.println();

		System.out.println("containsKey method()");
		System.out.println(ht.containsKey(5));
		System.out.println(ht.containsKey(10));
		System.out.println();

		System.out.println("isEmpty method(): ");
		System.out.println("HT second before emplty" + ht1);
		System.out.println("Checking HT before clear: " + ht1.isEmpty());
		ht1.clear();
		System.out.println("HT second after clear: " + ht1);
		System.out.println("Checking HT fater clear: " + ht1.isEmpty());
		System.out.println();

		System.out.println("get method() ");
		System.out.println("Element at 2nd position: " + ht.get(2));
		System.out.println("Element at 5th position: " + ht.get(5));
		System.out.println();

		System.out.println("size method()");
		System.out.println("Size of Hashtable: " + ht.size());
		System.out.println();

		System.out.println("Collection values method() ");
		System.out.println("Values in Hashtable: " + ht.values());
		System.out.println();

		System.out.println("keySet method() ");
		System.out.println("KeySet in Hashtable: " + ht.keySet());
		System.out.println();

		System.out.println("toString method()");
		System.out.println("HT before toString: " + ht);
		String s = ht.toString();
		System.out.println("Ht after converting into String: " + s);
		System.out.println();

		System.out.println("Enumeration key method() ");
		Enumeration en = ht.keys();
		while (en.hasMoreElements()) {
			System.out.print(en.nextElement() + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println("equals method(). ");
		ht1 = (Hashtable<Integer, String>) ht.clone();
		System.out.println("HT first before check equals: " + ht);
		System.out.println("HT before before check equals: " + ht1);
		System.out.println("Check equal: " + ht.equals(ht1));
		ht1.put(8, "Amit");
		System.out.println("Now HT first before check equals: " + ht);
		System.out.println("Now HT before before check equals: " + ht1);
		System.out.println("Now chck equals: " + ht.equals(ht1));
		System.out.println();

		System.out.println("Enumeration elements method()");
		Enumeration enm1 = ht.elements();
		while (enm1.hasMoreElements())
			System.out.print(enm1.nextElement() + " " + " ");
		System.out.println();
		System.out.println();

		System.out.println("compute method()");
		ht.compute(5, (key, val) -> val.subSequence(0, 6) + " " + "Yadav");
		ht.compute(1, (key, val) -> val.subSequence(0, 4) + " " + " Yadav");
		System.out.println(ht);
		System.out.println();

		System.out.println("omputeIfAbsent method() ");
		System.out.println("HT before computeIfAbsent: " + ht);
		ht.computeIfAbsent(8, k -> "Amit");
		System.out.println("HT after computeIfAbsent: " + ht);
		System.out.println();
	}
}
