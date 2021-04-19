package com.java.oopsConcept;

/**
 * @author Yadav Vinod, compile time polymorphism
 *
 */
public class Student14 {
	static int sum(int a, int b) {
		return a + b;
	}

	static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println(Student14.sum(10, 20));
		System.out.println(Student14.sum(10, 20, 30));

	}
}
