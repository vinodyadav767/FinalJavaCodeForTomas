/**
 * 
 */
package com.java.exceptionHandling;

/**
 * @author Yadav Vinod, finally block invoke here.
 *
 */
public class Student3 {
	public static void main(String[] args) {
		try {
			int a = 10 / 0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally block is running.");
		}
		System.out.println("rest of the code");
	}
}