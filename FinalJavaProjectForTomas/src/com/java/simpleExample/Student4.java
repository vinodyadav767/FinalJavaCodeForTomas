/**
 * 
 */
package com.java.simpleExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Yadav Vinod, synchronizedSet() , synchronizedSortedSet() 
 *
 */
public class Student4 {
	public static void main(String[] args) {
		Set<Integer> synSetColl=Collections.synchronizedSet(new HashSet<Integer>());
		Runnable runnable1=()->{
			synSetColl.addAll(Arrays.asList(5,10,20,25,40,100,125));
		};
		Thread th1=new Thread(runnable1);
		th1.start();
		try {
			th1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(synSetColl);
		System.out.println();
		
		SortedSet<Integer> synSortSet=Collections.synchronizedSortedSet(new TreeSet<Integer>());
		Runnable runnable2=()->{
			synchronized(synSortSet) {
				synSortSet.addAll(Arrays.asList(15,160,25,60,45,80,75,90));
				System.out.println("Set 80 head of the SortedSet: "+synSortSet.headSet(+80));
			}
		};
		Thread th2=new Thread(runnable2);
		th2.start();
		try {
			th2.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Set of SortedSet: "+synSortSet);
		System.out.println();
		
	}
}
