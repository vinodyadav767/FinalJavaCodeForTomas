/**
 * 
 */
package com.java.array;

/**
 * @author Yadav Vinod, Returning an array from the Method
 *
 */
public class Student5 {
	static int[] arr() {
		return new int[] { 10, 15, 50, 25, 30, 35, 100, 70, 60, 28 };
	}

	public static void main(String[] args) {
		int[] a = arr();
		System.out.print("Elements of Array: ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]+" ");
	}
}
