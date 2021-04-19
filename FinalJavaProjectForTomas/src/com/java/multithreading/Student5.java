/**
 * 
 */
package com.java.multithreading;

/**
 * @author Yadav Vinod, call run() method directly instead start() method
 *
 */
public class Student5 extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Student5 s1 = new Student5();
		Student5 s2 = new Student5();
		s1.run();
		s2.run();
	}
}
