package com.java.oopsConcept;

/**
 * @author Yadav Vinod, Covariant Return Type
 *
 */
class S10 {
	S10 getData() {
		return this;
	}
}

public class Student10 extends S10 {
	Student10 getData() {
		return this;
	}

	void printData() {
		System.out.println("out print method is working here.");
	}

	public static void main(String[] args) {
		Student10 s1 = new Student10();
		s1.getData().printData();
	}
}
