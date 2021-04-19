/**
 * 
 */
package com.java.multithreading;

/**
 * @author Yadav Vinod, Daemon Thread
 *
 */
public class Student9 extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread is working.");
		} else {
			System.out.println("User Thrad is working.");
		}
	}

	public static void main(String[] args) {
		Student9 s1 = new Student9();
		Student9 s2 = new Student9();
		Student9 s3 = new Student9();
		s1.setDaemon(true);
		s1.start();
		s2.start();
		s3.start();
	}
}
