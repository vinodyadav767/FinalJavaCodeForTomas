/**
 * 
 */
package com.java.synchronization;

/**
 * @author Yadav Vinod, Deadlock
 *
 */
public class Student4 {
	public static void main(String[] args) {
		final String res1 = "Sohan Yadav";
		final String res2 = "Satish Yadav";
		Thread t1 = new Thread() {
			public void run() {
				synchronized (res1) {
					System.out.println("Thread 1: locked res1.");
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						System.out.println(e);
					}
					synchronized (res2) {
						System.out.println("Thread1: locked res2.");
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized (res2) {
					System.out.println("Thread 1: locked res2.");
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						System.out.println(e);
					}
					synchronized (res1) {
						System.out.println("Thread1: locked res1.");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
}
