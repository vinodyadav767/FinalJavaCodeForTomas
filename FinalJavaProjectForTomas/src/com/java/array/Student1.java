/**
 * 
 */
package com.java.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Yadav Vinod, simple example to print the array
 *
 */
public class Student1 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 15;
		arr[3] = 20;
		arr[4] = 25;
		System.out.print("Elements of array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.print("Elements of array: ");
		for (int a : arr)
			System.out.print(a + " ");
		System.out.println();

		System.out.print("Sum of array: ");
		IntStream intStream = Arrays.stream(arr);
		System.out.println(intStream.sorted().sum());
		System.out.println();

	}
}
