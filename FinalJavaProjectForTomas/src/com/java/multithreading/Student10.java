/**
 * 
 */
package com.java.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Yadav Vinod
 *
 */
class S10 implements Runnable {
	private String msg;

	public S10(String s) {
		this.msg = s;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + "(Start Message)=" + msg);
		sendMessage();
	}

	private void sendMessage() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Student10 {
	public static void main(String[] args) {
		ExecutorService exetServ = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 20; i++) {
			Runnable run = new S10("" + i);
			exetServ.execute(run);
		}
		exetServ.shutdown();
		while (!exetServ.isTerminated()) {
		}
		System.out.println("Finished all the threads.");
	}
}
