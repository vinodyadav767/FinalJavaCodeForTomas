/**
 * 
 */
package com.java.vector;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * @author Yadav Vinod, All the methods of vector
 *
 */
public class Student1 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("add() method");
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		System.out.println("Vector Fisrt before add all: " + v);
		System.out.println();
		
		System.out.println("addAll() method");
		Vector<String> v1 = new Vector<String>();
		v1.add("E");
		v1.add("F");
		v1.add("G");
		v1.add("H");
		System.out.println("Vector second before add all: " + v1);
		v.addAll(v1);
		System.out.println("Vector first after add all: " + v);
		System.out.print("Vector first with for loop: ");
		for (String s : v)
			System.out.print(s + " ");
		System.out.println();
		System.out.println();
		
		System.out.println("addElement() method");
		System.out.println("Vector before add element: " + v);
		v.addElement("I");
		v.addElement("J");
		v.addElement("K");
		System.out.println("Vector after addelement: " + v);
		System.out.println();
		
		System.out.println("capacity() method");
		System.out.println("Capacity of the vector: " + v.capacity());
		System.out.println();
		
		System.out.println("Vector Second before clear: " + v1);
		v1.clear();
		System.out.println("Vector second after clear: " + v1);
		System.out.println();
		
		System.out.println("clone() method");
		System.out.println("Vector second before clone: " + v1);
		v1 = (Vector<String>) v.clone();
		System.out.println("Vector second after clone from vector first: " + v1);
		System.out.println();
		
		System.out.println("contains() method");
		if (v1.contains("A")) {
			System.out.println("We found A");
		} else {
			System.out.println("We didn't find A");
		}
		System.out.println();
		
		System.out.println("containsAll() method");
		if (v1.containsAll(v)) {
			System.out.println("All the elements of vector first is contains in vector second");
		} else {
			System.out.println("Didn't meet all elemets");
		}
		System.out.println();
		
		System.out.println("copyInto() method");
		String[] str = new String[v1.size()];
		v1.copyInto(str);
		for (String s : str)
			System.out.print(s + " ");
		System.out.println();
		System.out.println();
		
		System.out.println("elementAt() method");
		System.out.println("Element at index 6 position: " + v1.elementAt(6));
		System.out.println();
		
		Enumeration enm = v1.elements();
		while (enm.hasMoreElements())
			System.out.print(enm.nextElement() + " ");
		System.out.println();
		System.out.println();
		
		System.out.println("ensureCapacity() method");
		System.out.println("Capacity of vector: " + v1.capacity());
		v1.ensureCapacity(25);
		System.out.println("Capacity of vector: " + v1.capacity());
		System.out.println();
		
		System.out.println("equals() method");
		System.out.println(v.equals(v1));
		System.out.println(v1.firstElement());
		for (String s : v1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("get() method");
		System.out.println("Element at 5 position: " + v1.get(5));
		System.out.println();
		
		System.out.println("hashCode() method");
		System.out.println(v1.hashCode());
		System.out.println();
		
		System.out.println("indexOf() method");
		System.out.println("Index of I is: " + v.indexOf("I"));
		System.out.println();
		
		v1.insertElementAt("L", 5);
		System.out.println(v1);
		System.out.println();
		
		System.out.println("isEmpty() method");
		System.out.println("Vector: " + v);
		System.out.println("Vector before clear: " + v.isEmpty());
		v.clear();
		System.out.println("Vector after clear: " + v.isEmpty());
		System.out.println();
		
		System.out.println("iterator() method");
		Iterator<String> itr = v1.iterator();
		System.out.print("Vector after iterator: ");
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
		System.out.println();
		
		System.out.println("lastElement() method");
		System.out.println(v1.lastElement());
		v1.add("L");
		System.out.println(v1.lastIndexOf("L"));
		System.out.println();
		
		ListIterator<String> ltr = v1.listIterator();
		while (ltr.hasNext())
			System.out.print(ltr.next() + " ");
		System.out.println();
		while (ltr.hasPrevious())
			System.out.print(ltr.previous() + " ");
		System.out.println();
		System.out.println();
		
		System.out.println("remove() method");
		System.out.println("Vector before remove L: " + v1);
		v1.remove("L");
		System.out.println("Vector after remove L: " + v1);
		System.out.println();
		
		Vector<String> v2 = new Vector<String>();
		v2.add("J");
		v2.add("K");
		v2.add("L");
		System.out.println("Vector First before remove vector second: " + v1);
		System.out.println("removeAll() method");
		v1.removeAll(v2);
		System.out.println("Vector First after remove vector second: " + v1);
		System.out.println("Vector second before remove all elements: " + v2);
		
		System.out.println();
		System.out.println("removeAllElements() method");
		v2.removeAllElements();
		System.out.println("Vector second after remove all elements: " + v2);
		System.out.println();
		
		System.out.println(v1.removeIf(p -> p.charAt(0) == 'A'));
		System.out.println("retainAll() method");
		Vector<String> v3 = new Vector<String>();
		v3.add("A");
		v3.add("B");
		v3.add("C");
		v3.add("D");
		v3.add("E");
		v3.add("F");
		System.out.println("Vector third: " + v3);
		Vector<String> v4 = new Vector<String>();
		v4.add("D");
		v4.add("E");
		v4.add("F");
		
		System.out.println();
		System.out.println(v3.retainAll(v4));
		
		System.out.println();
		System.out.println("set() method");
		v3.set(0, "P");
		System.out.println(v3);
		
		System.out.println();
		System.out.println("setElementAt() method");
		v3.setElementAt("A", 0);
		System.out.println(v3);
		
		System.out.println();
		System.out.println("size() method");
		System.out.println("Third vector size: " + v3.size());
		
		System.out.println();
		System.out.println("setSize() method");
		v3.setSize(10);
		System.out.println("Updated size of vector: " + v3.size());
		
		System.out.println();
		System.out.println("sort() method");
		v1.add("A");
		v1.add("K");
		v1.add("J");
		System.out.println("Vector: " + v1);
		
		System.out.println();
		Collections.sort(v1);
		System.out.println("Sorted vector: " + v1);
		System.out.println("subList() method");

	}
}
