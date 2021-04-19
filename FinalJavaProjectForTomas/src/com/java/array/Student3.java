/**
 * 
 */
package com.java.array;

/**
 * @author Yadav Vinod, Passing Array to a Method
 *
 */
public class Student3 {
	static void min(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("Minimum values is : " + min);
	}

	public static void main(String[] args) {
		int[] parr = { 10, 15, 20, 40, 50, 5, 8 };
		Student3.min(parr);
	}
}
