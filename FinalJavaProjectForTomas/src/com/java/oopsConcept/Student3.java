/**
 * 
 */
package com.java.oopsConcept;

/**
 * @author Yadav Vinod, this keyword
 *
 */
public class Student3 {
	Student3() {
		this(10);
		System.out.println("default constructor.");
	}

	Student3(int a) {
		System.out.println("Parameterized constructor and parameter is: " + a);
	}

	void printFirstName() {
		System.out.println("Sohan");
	}

	void printLastName() {
		System.out.println("Yadav");
		this.printFirstName();
	}

	public static void main(String[] args) {
		Student3 s1 = new Student3();
		s1.printLastName();
	}
}
