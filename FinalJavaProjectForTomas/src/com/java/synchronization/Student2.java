/**
 * 
 */
package com.java.synchronization;

/**
 * @author Yadav Vinod, synchronized block
 *
 */
class S2 {
	void printTable(int a) {
		synchronized (this) {
			for (int i = 1; i < 10; i++) {
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}

public class Student2 {
	public static void main(String[] args) {
		final S1 s1 = new S1();
		Thread t1 = new Thread() {
			public void run() {
				s1.printTable(50);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				s1.printTable(100);
			}
		};
		t1.start();
		t2.start();
	}
}
