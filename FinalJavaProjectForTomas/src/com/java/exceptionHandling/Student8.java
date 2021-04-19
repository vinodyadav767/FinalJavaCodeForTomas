/**
 * 
 */
package com.java.exceptionHandling;

/**
 * @author Yadav Vinod,Custom Exception
 *
 */
class AgeNotValidException extends Exception {
	AgeNotValidException(String s) {
		super(s);
	}
}

public class Student8 {
	void ageCheck(int age) throws AgeNotValidException {
		if (age < 18) {
			throw new AgeNotValidException("Age is not valid for vote");
		} else {
			System.out.println("You are welcome for voting");
		}
	}

	public static void main(String[] args) {
		try {
			Student8 s1 = new Student8();
			s1.ageCheck(16);
		} catch (Exception e) {
			System.out.println("Exception occured " + e);
		}
	}
}
