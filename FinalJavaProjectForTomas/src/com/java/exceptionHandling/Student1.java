package com.java.exceptionHandling;

/**
 * @author Yadav Vinod, Scenarios where different kind of Exception occurs.
 *
 */
public class Student1 {
	public static void main(String[] args) {
		try {
			try {
				int a = 100 / 0;
				System.out.println(a);
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			try {
				String s = null;
				int len = s.length();
				System.out.println(len);
			} catch (NullPointerException e) {
				System.out.println(e);
			}
			try {
				int[] arr = new int[5];
				int val = arr[5];
				System.out.println(val);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			try {
				String s = "hello";
				int ca = Integer.parseInt(s);
				System.out.println(ca);
			} catch (NumberFormatException e) {
				System.out.println(e);
			}
			try {
				String str = "abc";
				int strlen = str.charAt(5);
				System.out.println(strlen);
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Normal flow");
	}

}
