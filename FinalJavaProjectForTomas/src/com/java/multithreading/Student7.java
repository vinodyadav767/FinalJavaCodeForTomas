/**
 * 
 */
package com.java.multithreading;

/**
 * @author Yadav Vinod, getName(),setName(String), getId() and Current Thread
 *
 */
public class Student7 extends Thread {
	public void run() {
		System.out.println("Current Thread name: "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Student7 s1 = new Student7();
		Student7 s2 = new Student7();
		System.out.println("Thread name: " + s1.getName());
		System.out.println("Thread name: " + s2.getName());
		System.out.println("Thread Id: " + s1.getId());
		System.out.println("Thread Id: " + s2.getId());
		s1.start();
		s2.start();
		s1.setName("My Thread 1");
		s2.setName("My Thread 2");
		System.out.println("Thread name: " + s1.getName());
		System.out.println("Thread name: " + s2.getName());
	}
}
