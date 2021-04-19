/**
 * 
 */
package com.java.oopsConcept;

/**
 * @author Yadav Vinod, instance initializer block
 *
 */
class S12 {
	S12() {
		System.out.println("Parent class contructor invoke.");
	}
}

public class Student12 extends S12 {
	Student12() {
		super();
		System.out.println("Child class constructor invoke.");
	}

	Student12(int a) {
		super();
		System.out.println("Child class parameterized constructor invoke here." + a);
	}

	{
		System.out.println("Instance initializer block invoked here.");
	}

	public static void main(String[] args) {
		Student12 s1 = new Student12();
		System.out.println();
		Student12 s2 = new Student12(10);
	}
}
