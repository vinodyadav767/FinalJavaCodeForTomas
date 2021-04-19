/**
 * 
 */
package com.java.linkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Yadav Vinod, LinkedList all the methods
 *
 */
public class Student1 {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Sohan");
		ll.add("Satish");
		ll.add("Saloni");
		System.out.println("Initially LinkeList elements: " + ll);

		System.out.println("add() method");
		ll.add("Shreya");
		System.out.println("LL after adding an element at the end: " + ll);
		System.out.println();

		System.out.println("add() method");
		System.out.println("LL before adding an element at spesific position: " + ll);
		ll.add(2, "Saloni");
		System.out.println("LL after adding an element at spesific postion: " + ll);
		System.out.println();

		System.out.println("addAll() method");
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("Avinash");
		ll1.add("Addi");
		ll1.add("Anand");
		System.out.println("First LL before adding all the elemensts of second LL: " + ll);
		ll.addAll(ll1);
		System.out.println("First LL after adding all the elemensts of second LL: " + ll);
		System.out.println();

		System.out.println("addAll() method.");
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Ansh");
		ll2.add("Shaumya");
		System.out.println("First LL before adding all th elements of Second LL at spesific position: " + ll);
		ll.addAll(3, ll2);
		System.out.println("First LL after adding all the elements of Second LL at spesific postion:" + ll);
		System.out.println();

		System.out.println("addFirst() method.");
		System.out.println("Elements of LL before adding an element at first position:" + ll);
		ll.addFirst("Bobby");
		System.out.println("Elements of LL after adding an element at first position:  " + ll);
		System.out.println();

		System.out.println("addLast() method.");
		System.out.println("Elements of LL before adding an element at last position: " + ll);
		ll.addLast("Prince");
		System.out.println("Elements of LL after adding an elemen at last position: " + ll);

		System.out.println("clear() method.");
		System.out.println("Elements of LL before clear: " + ll);
		ll.clear();
		System.out.println("Elements of LL after clear: " + ll);
		System.out.println();

		LinkedList<String> ll3 = new LinkedList<String>();
		ll3.add("Vinod");
		ll3.add("Sohan");
		ll3.add("Satish");
		System.out.println("Initial linkeList: " + ll3);

		System.out.println("clone() method.");
		LinkedList<String> ll4 = (LinkedList<String>) ll3.clone();
		System.out.println("Elements of LinkedList2 after clone fron First LL: " + ll4);
		System.out.println();

		System.out.println("contains() method");
		if (ll4.contains("Vinod"))
			System.out.println("Vinod is available here: ");
		else
			System.out.println("Vinod is presented here: ");
		System.out.println();

		System.out.println("descendingIterator() method");
		System.out.println("LL before descendingIterator method: " + ll4);
		System.out.print("LL after descendingIterator method: ");
		Iterator<String> itr = ll4.descendingIterator();
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
		System.out.println();

		System.out.println("element() method.");
		LinkedList<String> ll5 = new LinkedList<String>();
		ll5.add("Vinod");
		ll5.add("Sohan");
		ll5.add("Satish");
		System.out.println("Initial LL: " + ll5);
		System.out.println("First Element: " + ll5.element());
		System.out.println();

		System.out.println("get() method.");
		System.out.println("LL before element at S.P: " + ll5);
		System.out.println("Element at spesific position: " + ll5.get(2));
		System.out.println();

		System.out.println("getFirst() method");
		System.out.println("LL before getFirst Elements: " + ll5);
		System.out.println("First element of LL: " + ll5.getFirst());
		System.out.println();

		System.out.println("getLast() method");
		System.out.println("LL before element at alst position: " + ll5);
		System.out.println("Element of LL at last position: " + ll5.getLast());
		System.out.println();

		System.out.println("indexOf() method");
		System.out.println("LL for checking Index: " + ll5);
		System.out.println("Index of Vinod from LL: " + ll5.indexOf("Vinod"));
		System.out.println();

		System.out.println("lastIndexOf() method.");
		LinkedList<Integer> ll6 = new LinkedList<Integer>();
		ll6.add(10);
		ll6.add(20);
		ll6.add(30);
		ll6.add(40);
		ll6.add(50);
		ll6.add(20);
		System.out.println("Initially all elements of LL: " + ll6);
		System.out.println("Last Index of 20 is: " + ll6.lastIndexOf(20));
		System.out.println();

		LinkedList<Integer> ll7 = new LinkedList<Integer>();
		ll7.add(1);
		ll7.add(2);
		ll7.add(3);
		ll7.add(4);
		ll7.add(5);
		ll7.add(6);
		ll7.add(7);
		ll7.add(8);
		ll7.add(9);
		ll7.add(10);
		System.out.println("listIterator() method.");
		System.out.println("LL before using listIterator(int index): " + ll7);
		ListIterator li = ll7.listIterator(4);
		System.out.print("Elements from the LL in forword direction from position 4: ");
		while (li.hasNext())
			System.out.print(li.next() + " ");
		System.out.println();
		System.out.println();

		System.out.println("offer()");
		System.out.println("LL before using offer(E e) " + ll7);
		ll7.offer(11);
		System.out.println("LL after using offer(E,e) " + ll7);
		System.out.println();

		System.out.println("offerFirst()");
		System.out.println("LL before using offerFirst(E e): " + ll7);
		ll7.offerFirst(12);
		System.out.println("Ll after using offerFirst(E e): " + ll7);
		System.out.println();

		System.out.println("offerLast()");
		System.out.println("LL before using offerLast(E e): " + ll7);
		ll7.offerLast(13);
		System.out.println("LL after using offerLast(E e): " + ll7);
		System.out.println();

		System.out.println("peek() method");
		System.out.println("LL before using E peek(): " + ll7);
		System.out.println("Ll after using E peek(): " + ll7.peek());
		System.out.println();

		System.out.println("peekFirst() method");
		System.out.println("LL before using E peekFirst(): " + ll7);
		System.out.println("Ll after using E peekFirst(): " + ll7.peekFirst());
		System.out.println();

		System.out.println("peekLast() method.");
		System.out.println("LL before using E peekLast(): " + ll7);
		System.out.println("LL after using E peekLast(): " + ll7.peekLast());
		System.out.println();

		System.out.println("poll() method");
		LinkedList<String> ll8 = new LinkedList<String>();
		ll8.add("Vinod");
		ll8.add("Sohan");
		ll8.add("Satish");
		ll8.add("Saloni");
		ll8.add("Shreya");
		System.out.println("LL before using E poll(): " + ll8);
		System.out.println("LL after showing and removing first element: " + ll8.poll() + " " + ll8);
		ll8.poll();
		System.out.println("LL after again removing first element: " + ll8);
		System.out.println();

		System.out.println("pollFirst() method");
		System.out.println("LL before using E pollFirst(): " + ll8);
		System.out.println(ll8.pollFirst() + " " + ll8);
		System.out.println("LL after removing first element: " + ll8);
		System.out.println();

		System.out.println("pollLast() metod.");
		System.out.println("LL before removing last element: " + ll8);
		System.out.println("Ll after removing last element: " + ll8.pollLast() + " " + ll8);
		System.out.println("LL after removing last element: " + ll8);
		System.out.println();

		System.out.println("pop() method");
		LinkedList<String> ll9 = new LinkedList<String>();
		ll9.add("A");
		ll9.add("B");
		ll9.add("C");
		ll9.add("D");
		ll9.add("E");
		ll9.add("F");
		ll9.add("H");
		ll9.add("I");
		ll9.add("J");
		ll9.add("K");
		System.out.println("LL before E pop(): " + ll9);
		ll9.pop();
		System.out.println("LL after E pop(): " + ll9);
		System.out.println();

		System.out.println("push() method");
		System.out.println("LL before using push(E e) ;" + ll9);
		ll9.push("G");
		System.out.println("LL after using push(E e): " + ll9);
		System.out.println();

		System.out.println("remove() method");
		System.out.println("LL before using E remoove(): " + ll9);
		System.out.println("Removing Fist element: " + ll9.remove() + ll9);
		System.out.println("LL after using E remove(): " + ll9);
		System.out.println();

		System.out.println("remove() method");
		System.out.println("LL before using E remove(int index): " + ll9);
		ll9.remove(5);
		System.out.println("LL after removing an element at endex 5: " + ll9);
		System.out.println();

		System.out.println("remove() method");
		System.out.println("LL before using removing F: " + ll9);
		ll9.remove("F");
		System.out.println("LL after removing F: " + ll9);
		System.out.println();

		System.out.println("removeFirst()");
		System.out.println("LL before removing first element: " + ll9);
		ll9.removeFirst();
		System.out.println("LL after removing first element: " + ll9);
		System.out.println();

		System.out.println("removeFirstOccurrence() method.");
		ll9.add("I");
		System.out.println("LL before removeFirstOccurrence: " + ll9);
		if (ll9.removeFirstOccurrence("I"))
			System.out.println("First I has been removed: ");
		else
			System.out.println("There is no I in the list: ");
		System.out.println("LL after removing I: " + ll9);
		System.out.println();

		System.out.println("removeLast() method.");
		System.out.println("LL before removeLast: " + ll9);
		ll9.removeLast();
		System.out.println("LL after removing last element: " + ll9);
		System.out.println();

		System.out.println("removeLastOccurrence() method");
		ll9.add("D");
		System.out.println("LL before removeLastOccurrence: " + ll9);
		if (ll9.removeLastOccurrence("D"))
			System.out.println("Last D has been removed: " + ll9);
		else
			System.out.println("There is no D in the List: ");
		System.out.println();

		System.out.println("set() method");
		System.out.println("LL before set an element: " + ll9);
		ll9.set(2, "P");
		System.out.println("LL after set an elemet P at 2 postion: " + ll9);
		System.out.println();

		LinkedList<String> ll10 = new LinkedList<String>();
		ll10.add("A");
		ll10.add("B");
		ll10.add("C");
		ll10.add("D");
		ll10.add("E");
		ll10.add("F");
		ll10.add("G");
		ll10.add("H");
		System.out.println("Object[] toArray() method");
		System.out.println("Before Objet to array: " + ll10);
		Object[] obj = ll10.toArray();
		System.out.print("LL after object to aaray: ");
		for (Object a : obj)
			System.out.print(a + " ");
		System.out.println();
		System.out.println();

		System.out.println("T[] toArray() method.");
		Object[] obj1 = ll10.toArray();
		System.out.println("LL before List object toArray: " + ll10);
		System.out.println("LL After List object toArray: " + Arrays.toString(obj1));
		System.out.println();

		System.out.println("int size() method");
		System.out.println("LL before size(): " + ll10);
		System.out.print("LL after size(): ");
		for (int i = 0; i < ll10.size(); i++)
			System.out.print(ll10.get(i) + " ");
	}
}
