/**
 * 
 */
package com.java.exceptionHandling;

/**
 * @author Yadav Vinod, resolve the exception in a catch block
 *
 */
public class Student2 {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			int a = 10;
			int b = 0;
			int c = (a / (b + 2));
			System.out.println(c);
		}
		System.out.println("rest of code.");
	}
}