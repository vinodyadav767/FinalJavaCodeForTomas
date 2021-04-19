/**
 * 
 */
package com.java.multithreading;

/**
 * @author Yadav Vinod, performing two tasks by two threads
 *
 */
class S13 extends Thread {
	public void run() {
		System.out.println("First task completed.");
	}
}

public class Student13 extends Thread {
	public void run() {
		System.out.println("Second task completed.");
	}

	public static void main(String[] args) {
		S13 s1 = new S13();
		Student13 s2 = new Student13();
		s1.start();
		s2.start();
	}
}
