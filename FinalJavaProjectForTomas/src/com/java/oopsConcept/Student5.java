package com.java.oopsConcept;

/**
 * @author Yadav Vinod, anonymous object example
 */
public class Student5 {
	int fact = 1;

	void fac(int factVal) {
		for (int i = 1; i <= factVal; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial value of " + factVal + " is: " + fact);
	}

	public static void main(String[] args) {
		new Student5().fac(5);
	}
}
