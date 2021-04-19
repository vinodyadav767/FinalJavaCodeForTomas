/**
 * 
 */
package com.java.multithreading;

/**
 * @author Yadav Vinod, Shutdown Hook
 *
 */
public class Student12 extends Thread {
	public void run() {
		System.out.println("Shutdown Hook Performed");
	}

	public static void main(String[] args) {
		Runtime runTime = Runtime.getRuntime();
		runTime.addShutdownHook(new Student12());
		System.out.println("Main is sleeping please press ctrl+c to exit");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
