/**
 * 
 */
package com.java.list;

/**
 * @author Yadav Vinod, all the methods of List
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Spliterator;

public class Student1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		System.out.println("Initial List: " + list);
		System.out.println();

		System.out.println("add() method");
		list.add(2, "G");
		System.out.println("List after adding an element at position 2: " + list);
		System.out.println();

		System.out.println("addAll() method");
		List<String> list1 = new ArrayList<String>();
		list.add("H");
		list.add("I");
		list.add("J");
		System.out.println("List First before adding List Second: " + list);
		list.addAll(list1);
		System.out.println("List First after adding List Second: " + list);
		System.out.println();

		System.out.println("addAll() method");
		List<String> list2 = new ArrayList<String>();
		list2.add("K");
		list2.add("L");
		list2.add("M");
		System.out.println("List First before adding List Second at spesific position: " + list);
		list.addAll(2, list2);
		System.out.println("List First after adding List Second at 2 position: " + list);
		System.out.println();

		System.out.println("clear() method");
		System.out.println("List before clear: " + list);
		list.clear();
		System.out.println("List after clear: " + list);
		System.out.println();

		System.out.println("equals() method");
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.add(4);
		list3.add(5);
		System.out.println("List First: " + list3);
		List<Integer> list4 = new ArrayList<Integer>();
		list4.add(1);
		list4.add(2);
		list4.add(3);
		list4.add(4);
		list4.add(5);
		System.out.println("List Second: " + list4);
		if (list3.equals(list4))
			System.out.println("List Second is equal to List First");
		else
			System.out.println("List Second is not is equal to List First");
		System.out.println();

		System.out.println("hashcode() method");
		List<String> list5 = new ArrayList<String>();
		list5.add("A");
		list5.add("B");
		list5.add("C");
		list5.add("D");
		int a = list.hashCode();
		int b = list1.hashCode();
		int c = list2.hashCode();
		int d = list3.hashCode();
		int e = list4.hashCode();
		int f = list5.hashCode();
		System.out.println("hashcode of List1: " + a);
		System.out.println("hashcode of List2: " + b);
		System.out.println("hashcode of List3: " + c);
		System.out.println("hashcode of List4: " + d);
		System.out.println("hashcode of List5: " + e);
		System.out.println("hashcode of List6: " + f);
		System.out.println();

		System.out.println("get() method.");
		System.out.println("Get element from spesific postion.");
		System.out.println("Getting the element at position 2: " + list5.get(2));
		System.out.println();

		System.out.println("isEmpty() method.");
		System.out.println("List before check empty: " + list5);
		if (list5.isEmpty())
			System.out.println("List is empty");
		else
			System.out.println("list is not empty");
		System.out.println();

		System.out.println("List before check empty: " + list);
		if (list.isEmpty())
			System.out.println("List is empty");
		else
			System.out.println("list is not empty");
		System.out.println();

		System.out.println("Lastindexof() method");
		List<String> list6 = new ArrayList<String>();
		list6.add("Vinod");
		list6.add("Sohan");
		list6.add("Satish");
		System.out.println("List: " + list6);
		System.out.println("Indexof Vinod is: " + list6.indexOf("Vinod"));
		System.out.println();

		System.out.println("Object to array method.");
		List<Integer> list7 = new ArrayList<Integer>();
		list7.add(1);
		list7.add(2);
		list7.add(3);
		list7.add(4);
		list7.add(5);
		System.out.println("List before Object[] toarray: " + list7);
		Object[] obj = list7.toArray();
		System.out.print("Each elements of List by Object[] to array: ");
		for (Object item : obj)
			System.out.print(item + " ");
		System.out.println();

		System.out.println("List obejct to array method");
		List<Integer> list8 = new ArrayList<Integer>();
		list8.add(1);
		list8.add(2);
		list8.add(3);
		list8.add(4);
		list8.add(5);
		System.out.println("List: " + list8);
		Integer intarr[] = new Integer[list8.size()];
		intarr = list8.toArray(intarr);
		System.out.println("Each elemet of List by <T> T[] toArray(T[] a): " + Arrays.toString(intarr));

		System.out.println("a program for String list to array");
		List<String> l = new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		l.add("F");
		System.out.println("List: " + l);
		String strarr[] = new String[l.size()];
		strarr = l.toArray(strarr);
		System.out.println("List after converting into Array: " + Arrays.toString(strarr));
		System.out.println();

		System.out.println("Convert Array to List");
		String strarr1[] = { "A", "B", "C", "D" };
		System.out.println("Array before converting into List:" + Arrays.toString(strarr1));
		List<String> l2 = new ArrayList<String>();
		for (String item : strarr1)
			l2.add(item);
		System.out.println("List after converting from array: " + l2);
		System.out.println();

		System.out.println("Contains() method");
		List<Integer> l3 = new ArrayList<Integer>();
		l3.add(1);
		l3.add(2);
		l3.add(3);
		l3.add(4);
		l3.add(5);
		l3.add(6);
		System.out.println("List before check contains: " + l3);
		if (l3.contains(4))
			System.out.println("We found 4 in the list");
		else
			System.out.println("Didn't find 4 in the list");
		System.out.println();

		System.out.println("ContainsAll() method");
		List<String> l4 = new ArrayList<String>();
		l4.add("A");
		l4.add("B");
		l4.add("C");
		l4.add("D");
		l4.add("E");
		l4.add("F");
		System.out.println("List First: " + l4);
		List<String> l5 = new ArrayList<String>();
		l5.add("B");
		l5.add("C");
		l5.add("D");
		l5.add("E");
		System.out.println("List Second: " + l5);
		if (l4.containsAll(l5))
			System.out.println("All the elements of List Second  is belongs to List First");
		else
			System.out.println("All the elements of List Second  does not belongs to List First");
		System.out.println();

		System.out.println("IndexOf() method");
		System.out.println("List: " + l5);
		System.out.println("index of D is: " + l5.indexOf("D"));
		System.out.println();

		System.out.println("remove() method");
		System.out.println("List before remove: " + l5);
		l5.remove(2);
		System.out.println("List after remove at pos 2: " + l5);
		System.out.println();

		System.out.println("remove() method");
		List<String> l6 = new ArrayList<String>();
		l6.add("A");
		l6.add("B");
		l6.add("A");
		l6.add("C");
		l6.add("D");
		l6.add("B");
		System.out.println("List before remove B: " + l6);
		l6.remove("B");
		System.out.println("List after remove B: " + l6);
		System.out.println();

		System.out.println("removeAll() method");
		List<String> l7 = new ArrayList<String>();
		l7.add("A");
		l7.add("B");
		l7.add("C");
		l7.add("D");
		l7.add("E");
		l7.add("F");
		l7.add("G");
		l7.add("H");
		System.out.println("List First before removing List Second: " + l7);
		List<String> l8 = new ArrayList<String>();
		l8.add("C");
		l8.add("D");
		l8.add("E");
		l8.add("F");
		System.out.println("List Second before removin into List First: " + l8);
		l7.removeAll(l8);
		System.out.println("List First after removing List Second: " + l7);
		System.out.println();

		System.out.println("retainAll() method");
		List<String> l9 = new ArrayList<String>();
		l9.add("A");
		l9.add("B");
		l9.add("C");
		l9.add("D");
		l9.add("E");
		l9.add("F");
		l9.add("G");
		System.out.println("List First: " + l9);
		List<String> l10 = new ArrayList<String>();
		l10.add("C");
		l10.add("D");
		l10.add("E");
		l10.add("F");
		System.out.println("List Second before retain: " + l10);
		l9.retainAll(l10);
		System.out.println("List First after reatin from List Second: " + l9);
		System.out.println();

		System.out.println("set() method");
		System.out.println("List before set anything: " + l10);
		l10.set(1, "B");
		System.out.println("List after setting B instead of D: " + l10);
		System.out.println();

		System.out.println("sort() method");
		List<Integer> l11 = new ArrayList<Integer>();
		l11.add(10);
		l11.add(60);
		l11.add(50);
		l11.add(30);
		l11.add(20);
		l11.add(40);
		System.out.println("List before sort: " + l11);
		Collections.sort(l11);
		System.out.println("List after sort: " + l11);
		System.out.println();

		System.out.println("Spliterator() method");
		List<String> l12 = new ArrayList<String>();
		l12.add("A");
		l12.add("B");
		l12.add("C");
		l12.add("D");
		l12.add("E");
		l12.add("F");
		l12.add("G");
		l12.add("H");
		System.out.println("List " + l12);
		Spliterator<String> spt = l12.spliterator();
		System.out.print("List by Spliterator ");
		spt.forEachRemaining(aa -> {
			System.out.print(aa + " ");
		});
		System.out.println();
		System.out.println();

		System.out.println("subList() Method");
		List<String> l13 = new ArrayList<String>();
		l13.add("A");
		l13.add("B");
		l13.add("C");
		l13.add("D");
		l13.add("E");
		l13.add("F");
		l13.add("G");
		l13.add("H");
		System.out.println("List before sub List: " + l13);
		List<String> l14 = new ArrayList<String>();
		System.out.println("List Second without adding sublist: " + l14);
		l14 = l13.subList(2, 6);
		System.out.println("List second after adding sub List: " + l14);

	}
}
