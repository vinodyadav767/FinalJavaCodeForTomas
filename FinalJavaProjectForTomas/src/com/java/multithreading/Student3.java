/**
 * 
 */
package com.java.multithreading;

/**
 * @author Yadav Vinod, sleep method
 *
 */
public class Student3 extends Thread {
	public void run() {
		for (int i=1; i<5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Student3 s1=new Student3();
		Student3 s2=new Student3();
		s1.start();
		s2.start();
	}
}
