/**
 * 
 */
package com.java.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author Yadav Vinod, methods of linkedHashset
 *
 */
public class Student1 {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Vinod");
		lhs.add("Sohan");
		lhs.add("Satish");
		Iterator itr = lhs.iterator();
		System.out.print("LHS: ");
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
		System.out.println();

		System.out.println("LinkedHashSet before adding: " + lhs);
		if (lhs.add("Saloni"))
			System.out.println("Saloni added succesfully: ");
		else
			System.out.println("Saloni already exist: ");
		if (lhs.add("Vinod"))
			System.out.println("Vinod added succesfully");
		else
			System.out.println("Vinod already exist");
		System.out.println("LinkedHashSet after adding : " + lhs);
	}
}
