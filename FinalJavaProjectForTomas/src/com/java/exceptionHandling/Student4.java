/**
 * 
 */
package com.java.exceptionHandling;

/**
 * @author Yadav Vinod, Exception propagation
 *
 */
public class Student4 {
	void devide() {
		int a = 100 / 0;
	}

	void callMethod() {
		devide();
	}

	void exceptionCallMethod() {
		try {
			callMethod();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
	}

	public static void main(String[] args) {
		Student4 s1 = new Student4();
		s1.exceptionCallMethod();
		System.out.println("Normal flow");
	}
}
