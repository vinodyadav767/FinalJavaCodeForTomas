/**
 * 
 */
package com.java.synchronization;

/**
 * @author Yadav Vinod, Static Synchronization
 *
 */
class S3 {
	synchronized static void printTable(int a) {
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

class Thrad1 extends Thread {
	public void run() {
		S3.printTable(1);
	}
}

class Thrad2 extends Thread {
	public void run() {
		S3.printTable(10);
	}
}

class Thrad3 extends Thread {
	public void run() {
		S3.printTable(100);
	}
}

class Thrad4 extends Thread {
	public void run() {
		S3.printTable(1000);
	}
}

public class Student3 {
	public static void main(String[] args) {
		Thrad1 t1 = new Thrad1();
		Thrad2 t2 = new Thrad2();
		Thrad3 t3 = new Thrad3();
		Thrad4 t4 = new Thrad4();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
