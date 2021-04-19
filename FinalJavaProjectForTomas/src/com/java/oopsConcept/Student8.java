package com.java.oopsConcept;

/**
 * @author Yadav Vinod, Method Overloading
 *
 */
public class Student8 {
	int sum(int a, int b) {
		return a + b;
	}

	int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		Student8 s1 = new Student8();
		int p1sum = s1.sum(10, 20);
		System.out.println("Sum of first method: " + p1sum);
		int p2sum = s1.sum(10, 20, 30);
		System.out.println("Sum of second method: " + p2sum);
	}
}
