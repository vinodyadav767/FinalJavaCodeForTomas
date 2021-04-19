/**
 * 
 */
package com.java.multithreading;

/**
 * @author Yadav Vinod, Joining A Thread
 *
 */
public class Student6 extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Student6 s1 = new Student6();
		Student6 s2 = new Student6();
		Student6 s3 = new Student6();
		s1.start();
		try {
			s1.join(1500);
		} catch (Exception e) {
			System.out.println(e);
		}
		s2.start();
		s3.start();
	}
}
