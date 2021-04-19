/**
 * 
 */
package com.java.oopsConcept;

/**
 * @author Yadav Vinod, Abstract class
 *
 */
abstract class S17 {
	S17() {
		System.out.println("abstrct class constructor.");
	}

	abstract void absMethod();

	void nonAbsMethod() {
		System.out.println("None abstrct method is here.");
	}
}

public class Student17 extends S17 {
	void absMethod() {
		System.out.println("Implimentation of abstrct method");
	}

	public static void main(String[] args) {
		Student17 s1 = new Student17();
		s1.absMethod();
		s1.nonAbsMethod();
	}
}
