/**
 * 
 */
package com.java.multithreading;

/**
 * @author Yadav Vinod, Thread Example by implementing Runnable interface
 *
 */
public class Student2 implements Runnable {
	public void run()
	{
		System.out.println("Thread started.");
	}
	public static void main(String[] args) {
		Student2 s1=new Student2();
		Thread t1=new Thread(s1);
		t1.start();
	}
}
