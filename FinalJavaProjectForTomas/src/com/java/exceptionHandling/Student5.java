/**
 * 
 */
package com.java.exceptionHandling;

import java.io.IOException;

/**
 * @author Yadav Vinod, throws keyword
 *
 */
public class Student5 {
	void m() throws IOException {
		throw new IOException();
	}

	public static void main(String[] args) {
		try {
			Student5 s1 = new Student5();
			s1.m();
		} catch (Exception e) {
			System.out.println("Exception handeled");
		}
		System.out.println("Normal flow");
	}
}
