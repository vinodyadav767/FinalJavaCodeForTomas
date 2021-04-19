package com.java.oopsConcept;

/**
 * @author Yadav Vinod, Final Keyword
 *
 */
// final class can't be extended
final class S13 {

}

public class Student13 {
	final int a = 10;
	final int b;
	static final int c;

	Student13() {
		b = 15;
		System.out.println("Value of b: " + b);
	}

	static {
		c = 20;
		System.out.println("Value of c is: " + c);
	}

	final void add(int num1, int num2)// cannot override final method
	{
		System.out.println(num1 + num2);
	}

	public static void main(String[] args) {
		Student13 s1 = new Student13();
		s1.add(10, 20);
	}
}
