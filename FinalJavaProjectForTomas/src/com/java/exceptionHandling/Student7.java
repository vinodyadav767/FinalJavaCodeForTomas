/**
 * 
 */
package com.java.exceptionHandling;

/**
 * @author Yadav Vinod, ExceptionHandling with MethodOverriding
 *
 */
class S7 {
	void printData() throws Exception {
		System.out.println("Parent exception here");
	}
}

public class Student7 extends S7 {
	void printData() throws ArithmeticException {
		System.out.println("Child exception is here.");
	}

	public static void main(String[] args) {
		S7 s1 = new Student7();
		try {
			s1.printData();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
