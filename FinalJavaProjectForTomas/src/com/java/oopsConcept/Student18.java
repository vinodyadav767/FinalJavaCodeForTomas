/**
 * 
 */
package com.java.oopsConcept;

/**
 * @author Yadav Vinod, Interface
 *
 */
interface Print {
	void printData();
}

interface Show {
	void showData();
}

public class Student18 implements Print, Show {
	public void printData() {
		System.out.println("Printing our data here");
	}

	public void showData() {
		System.out.println("Showing our data here");
	}

	public static void main(String[] args) {
		Student18 s1 = new Student18();
		s1.printData();
		s1.showData();
	}
}
