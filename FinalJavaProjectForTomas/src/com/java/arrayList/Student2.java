/**
 * 
 */
package com.java.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Yadav Vinod
 *
 */
public class Student2 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(30);
		arrayList.add(20);
		arrayList.add(50);
		arrayList.add(40);
		System.out.println("All the elements of ArrayList: "+arrayList);
		Collections.sort(arrayList,(a,b)->(a>b)?-1:(a<b)?1:0);
		System.out.println("ArrayList sorted by lambda expression: "+arrayList);
	}
}
