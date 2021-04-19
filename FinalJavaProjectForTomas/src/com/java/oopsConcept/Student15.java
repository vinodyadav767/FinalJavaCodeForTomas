/**
 * 
 */
package com.java.oopsConcept;

/**
 * @author Yadav Vinod, runtime polymorphism
 *
 */
class Bank1 {
	double getRateOfInterest() {
		return 0.0;
	}
}

class EquaBank1 extends Bank1 {
	double getRateOfInterest() {
		return 9.5;
	}
}

class AirBank1 extends Bank1 {
	double getRateOfInterest() {
		return 8.5;
	}
}

class UniCreditBank1 extends Bank1 {
	double getRateOfInterest() {
		return 8.0;
	}
}

public class Student15 {
	public static void main(String[] args) {
		// reference variable of Parent class, object of Child class
		Bank1 b;
		b = new EquaBank1();
		System.out.println("Rate OfI nterest of Equa Bank : " + b.getRateOfInterest());
		b = new AirBank1();
		System.out.println("Rate OfI nterest of Air Bank: " + b.getRateOfInterest());
		b = new UniCreditBank1();
		System.out.println("Rate OfI nterest of UniCredit Bank: " + b.getRateOfInterest());
	}

}