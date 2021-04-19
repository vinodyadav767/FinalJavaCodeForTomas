/**
 * 
 */
package com.java.array;

/**
 * @author Yadav Vinod, Cloning an Array
 *
 */
public class Student6 {
	public static void main(String[] args) {
		int[] arr = { 10, 15, 20, 25, 30 };
		System.out.print("Elements of array: ");
		for (int a : arr)
			System.out.print(a+" ");
		System.out.println();
		
		int[] arr1 = arr.clone();
		System.out.print("Elements of clone array: ");
		for (int b : arr1)
			System.out.print(b+" ");
	}
}