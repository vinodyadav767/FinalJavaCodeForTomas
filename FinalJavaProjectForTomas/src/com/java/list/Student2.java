/**
 * 
 */
package com.java.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Yadav Vinod,  ListIterator methods of List
 *
 */
public class Student2 {
	public static void main(String[] args) {
		List<Integer> intList = Collections.synchronizedList(new ArrayList<Integer>());
		Runnable runnable1 = () -> {
			synchronized (intList) {
				intList.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
				System.out.println("SubList of List from 2 to 6: "+intList.subList(2, 6));
				System.out.print("Iterate List: ");
				intList.forEach(p->System.out.print(p+" "));
				System.out.println();
			}
		};
		System.out.println("List before Thread start: "+intList);
		Thread th1 = new Thread(runnable1);
		th1.start();
		try {
			th1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("List after Thread start: "+intList);
		
		System.out.println();
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println("Initial List :" + list);
		ListIterator<String> litr = list.listIterator();
		litr.add("E");
		litr.add("F");
		System.out.print("Traversing elements in forword direction: ");
		while (litr.hasNext())
			System.out.print(litr.next() + " ");
		System.out.println();

		System.out.print("Traversing elements in backword direction: ");
		while (litr.hasPrevious())
			System.out.print(litr.previous() + " ");
		System.out.println();
		System.out.println();
	}
}