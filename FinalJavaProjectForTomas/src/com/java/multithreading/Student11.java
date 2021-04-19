/**
 * 
 */
package com.java.multithreading;

/**
 * @author Yadav Vinod, ThreadGroup
 *
 */
public class Student11 implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Student11 s1 = new Student11();
		ThreadGroup tg = new ThreadGroup("Parent Group");
		Thread t1 = new Thread(tg, s1, "one");
		t1.start();
		Thread t2 = new Thread(tg, s1, "two");
		t2.start();
		Thread t3 = new Thread(tg, s1, "two");
		t3.start();
		System.out.println("Thread group name: " + tg.getName());
		tg.list();
	}
}
