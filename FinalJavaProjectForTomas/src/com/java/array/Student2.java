/**
 * 
 */
package com.java.array;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Yadav Vinod, Array example stream and for loop
 *
 */
public class Student2 {
	public static void main(String[] args) {
		int[] arr = { 10, 15, 20, 25, 30 };
		System.out.print("Elements of Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.print("Elements of Array: ");
		for (int a : arr)
			System.out.print(a+" ");
		System.out.println();

		IntStream intStream = Arrays.stream(arr);
		int maxInArr = intStream.sorted().max().orElseThrow(ArithmeticException::new);
		System.out.println("Max number in Array: " + maxInArr);
	}
}
