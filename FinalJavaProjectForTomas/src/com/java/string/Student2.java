/**
 * 
 */
package com.java.string;

/**
 * @author Yadav Vinod, StringBuffer
 *
 */
public class Student2 {
	public static void main(String[] args) {
		System.out.println("mutable string");
		System.out.println("append() method");
		StringBuffer sb = new StringBuffer("Satish Yadav ");
		sb.append("Sohan Yadav");
		System.out.println(sb);
		System.out.println();

		System.out.println("insert() method");
		sb.insert(2, "Hello");
		System.out.println(sb);
		System.out.println();

		System.out.println("replace() method");
		sb.replace(2, 7, "");
		System.out.println(sb);
		System.out.println();

		System.out.println("delete() method");
		sb.delete(7, 13);
		System.out.println(sb);
		System.out.println();

		System.out.println("reverse() method");
		System.out.println(sb.reverse());
		System.out.println();

		System.out.println("capacity() method");
		System.out.println(sb.capacity());
	}
}
