/**
 * 
 */
package com.java.multithreading;

/**
 * @author Yadav Vinod, Thread Example by extending Thread class 
 *
 */
public class Student1 extends Thread{
	public void run()
	{
		System.out.println("Thread started.");
	}
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.start();
	}
}
