/**
 * 
 */
package com.java.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Yadav Vinod, All the methods of Set
 *
 */
public class Student1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		System.out.println("add() method");
		set.add("Sohan");
		set.add("Satish");
		set.add("Saloni");
		set.add("Shreya");
		System.out.println(set);
		System.out.println();

		System.out.println("addAll() method");
		Set<String> set1 = new HashSet<String>();
		set1.addAll(set);
		System.out.println(set1);
		System.out.println();

		System.out.println("clear() method");
		System.out.println("Set before clear: " + set1);
		set1.clear();
		System.out.println("Set after clear: " + set1);
		System.out.println();

		System.out.println("contains() method");
		if (set.contains("Shreya")) {
			System.out.println("We found Shreya.");
		} else {
			System.out.println("We didn't find Shreya.");
		}
		System.out.println();

		System.out.println("containsAll() method");
		Set<String> set2 = new HashSet<String>();
		set2.add("Saloni");
		set2.add("Shreya");
		if (set.containsAll(set2))
			System.out.println("We found second set into first set.");
		else
			System.out.println("We didn't find second set into first set.");
		System.out.println();

		System.out.println("hashCode() method");
		System.out.println("Hash code: " + set.hashCode());
		System.out.println();

		System.out.println("isEmpty() method");
		System.out.println("Check set is empty or not: " + set.isEmpty());
		System.out.println("Check set is empty or not: " + set1.isEmpty());
		System.out.println("Check set is empty or not: " + set2.isEmpty());
		System.out.println();

		System.out.println("iterator() method");
		Iterator itr = set.iterator();
		System.out.println("Iterate set here.");
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
		System.out.println();

		System.out.println("remove() method");
		System.out.println("Set before remove Satish: " + set);
		set.remove("Satish");
		System.out.println("Set after remove Satish: " + set);
		System.out.println();

		System.out.println("removeAll() method");
		Set<String> set3 = new HashSet<String>();
		set3.add("Sohan");
		set3.add("Saloni");
		System.out.println("Set first before removing elements of set second: " + set);
		System.out.println("Set second before removing elements into set second: " + set3);
		set.removeAll(set3);
		System.out.println("Set first after removing elements of set second: " + set);
	}
}
