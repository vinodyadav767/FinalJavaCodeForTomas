/**
 * 
 */
package com.java.exceptionHandling;

/**
 * @author Yadav Vinod
 *
 */
public class Student6 {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exeption occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array IndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exeption Ocuur");
		}
		System.out.println("rest of the code");
	}

}

