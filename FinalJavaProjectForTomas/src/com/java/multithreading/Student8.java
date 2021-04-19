/**
 * 
 */
package com.java.multithreading;

/**
 * @author Yadav Vinod, priority of a Thread
 *
 */
public class Student8 extends Thread {
	public void run() {
		System.out.println("Thread Name is: " + Thread.currentThread().getName());
		System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		Student8 s1 = new Student8();
		Student8 s2 = new Student8();
		Student8 s3 = new Student8();
		s1.setPriority(Thread.MIN_PRIORITY);
		s2.setPriority(Thread.NORM_PRIORITY);
		s3.setPriority(Thread.MAX_PRIORITY);
		s1.start();
		s2.start();
		s3.start();
	}
}
