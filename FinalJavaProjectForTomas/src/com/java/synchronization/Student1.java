/**
 * 
 */
package com.java.synchronization;

/**
 * @author Yadav Vinod, synchronized method
 *
 */
class S1 {
	synchronized void printTable(int a) {
		for (int i = 0; i < 10; i++) {
			System.out.println(a * i);
			try {
				Thread.sleep(500);

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class Student1 extends Thread {
	S1 s;

	Student1(S1 s) {
		this.s = s;
	}

	public void run() {
		s.printTable(100);
	}

	public static void main(String[] args) {
		S1 s1 = new S1();
		Student1 s2 = new Student1(s1);
		Student1 s3 = new Student1(s1);
		s2.start();
		s3.start();
	}
}
