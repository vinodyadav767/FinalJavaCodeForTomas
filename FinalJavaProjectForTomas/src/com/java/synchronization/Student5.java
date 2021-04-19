/**
 * 
 */
package com.java.synchronization;

/**
 * @author Yadav Vinod, inter thread communication
 *
 */
class Customer {
	double amt = 50000;

	synchronized void cashWithdraw(double amt) {
		System.out.println("Going to withdraw money.");
		if (this.amt < amt) {
			System.out.println("Insufficient balance, waiting for deposits");
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		this.amt -= amt;
		System.out.println("withdraw successfully completed.");
	}

	synchronized void cashDeposit(double amt) {
		System.out.println("Going for deposit");
		this.amt += amt;
		System.out.println("Deposit completed");
		notify();
	}
}

public class Student5 {
	public static void main(String[] args) {
		final Customer c = new Customer();
		new Thread() {
			public void run() {
				c.cashWithdraw(60000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.cashDeposit(20000);
			}
		}.start();
	}
}
