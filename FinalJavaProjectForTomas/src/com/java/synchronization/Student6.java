/**
 * 
 */
package com.java.synchronization;

/**
 * @author Yadav Vinod, isInterrupted and interrupted method
 *
 */
public class Student6 extends Thread {
	public void run() {
		if (Thread.interrupted()) {
			System.out.println("This code is for interrupted thread");
		} else {
			System.out.println("code for normal thread");
		}
	}

	public static void main(String[] args) {
		Student6 s1 = new Student6();
		Student6 s2 = new Student6();
		s1.start();
		s1.interrupt();
		s2.start();
	}
}
