package com.java.oopsConcept;

/**
 * @author Yadav Vinod, instanceof
 *
 */
class S16 {
	void printDownCast() {
		System.out.println("Downcasting performed. ");
	}
}

public class Student16 extends S16 {
	static void checkDownCasting(S16 s) {
		if (s instanceof S16) {
			S16 s1 = (S16) s;
			s1.printDownCast();
		}
	}

	public static void main(String[] args) {
		Student16 s2 = new Student16();
		Student16.checkDownCasting(s2);
	}
}
