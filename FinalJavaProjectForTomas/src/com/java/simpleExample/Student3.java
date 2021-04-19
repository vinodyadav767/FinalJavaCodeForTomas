/**
 * 
 */
package com.java.simpleExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Yadav Vinod, synchronizedList()
 *
 */
public class Student3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> sysnCollList = Collections.synchronizedList(list);
		Runnable runnable = () -> {
			sysnCollList.addAll(Arrays.asList(10, 20, 30, 40, 50));
		};
		System.out.println("List before thread start: " + sysnCollList);
		Thread th1 = new Thread(runnable);
		th1.start();
		try {
			th1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("List after thread start: " + sysnCollList);
		System.out.println();

		List<String> synStrList = Collections.synchronizedList(Arrays.asList("A", "B", "C", "D"));
		List<String> lowerCaseColl = new ArrayList<String>();
		Runnable runnable2 = () -> {
			synchronized (synStrList) {
				synStrList.forEach(p -> {
					lowerCaseColl.add(p.toLowerCase());
				});
			}
		};
		Thread th3 = new Thread(runnable2);
		System.out.println("Lower String before thread start: " + lowerCaseColl);
		th3.start();
		try {
			th3.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Caps String: " + synStrList);
		System.out.println("Lower String after thread statrt: " + lowerCaseColl);
	}
}
