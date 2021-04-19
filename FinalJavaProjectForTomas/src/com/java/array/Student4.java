/**
 * 
 */
package com.java.array;

/**
 * @author Yadav Vinod, Anonymous Array in Java, receiving an array as a parameter 
 *
 */
public class Student4 {
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		printArray(new int[] { 10, 5, 15, 25, 40, 36, 100 });
	}
}
