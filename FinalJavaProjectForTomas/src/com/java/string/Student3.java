/**
 * 
 */
package com.java.string;

/**
 * @author Yadav Vinod, StringBuilder
 *
 */
public class Student3 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Saloni Yadav ");
		System.out.println("append() method");
		sb.append("Shreya Yadav");
		System.out.println(sb);
		System.out.println();

		System.out.println("insert() method");
		sb.insert(0, "Hello ");
		System.out.println(sb);

		System.out.println("replace() method");
		sb.replace(0, 5, "Hi");
		System.out.println(sb);

		System.out.println("delete() method");
		sb.delete(0, 16);
		System.out.println(sb);
		System.out.println();

		System.out.println("reverse() method");
		System.out.println(sb.reverse());
		System.out.println();

		System.out.println("capacity() method");
		System.out.println(sb.capacity());
	}
}
