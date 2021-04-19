/**
 * 
 */
package com.java.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Yadav Vinod, Handling Exceptions
 *
 */
public class Student4 {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.forEach(p -> {
			try {
				p += 100;
				System.out.println(p);
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
		});
		System.out.println();
		intList.forEach(p -> {
			p += 1000;
			try {
				Thread.sleep(p);
				System.out.println(p);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		});
		System.out.println();
		intList.stream().sorted(Comparator.reverseOrder()).forEach(p -> {
			System.out.println(p);
		});
	}
}
