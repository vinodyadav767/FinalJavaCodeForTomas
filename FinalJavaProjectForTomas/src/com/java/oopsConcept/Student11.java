package com.java.oopsConcept;

/**
 * @author Yadav Vinod, super keyword
 *
 */
class S11 {
	String color = "Red";

	void printData() {
		System.out.println("method of parent class");
	}

	S11() {
		System.out.println("Constructor of Parent class.");
	}
}

public class Student11 extends S11 {
	String color = "Green";

	void printData() {
		super.printData();
		System.out.println("print method of child class");
	}

	void printColor() {
		System.out.println("Color of super parent class : " + super.color);
		System.out.println("Color of child class: " + color);
	}

	void methodChildClass() {
		System.out.println("method of child class.");
	}

	Student11() {
		System.out.println("Constructor of child class.");
	}

	public static void main(String[] args) {
		Student11 s1 = new Student11();
		s1.printData();
		System.out.println();
		s1.methodChildClass();
		s1.printColor();
	}
}
