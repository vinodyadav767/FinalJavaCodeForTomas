/**
 * 
 */
package com.java.multithreading;

/**
 * @author Yadav Vinod, start a thread twice
 *
 */
public class Student4 extends Thread {
	public void run() {
		System.out.println("Thread started");
	}

	public static void main(String[] args) {
		Student4 s1 = new Student4();
		s1.start();
		s1.start();
	}
}
