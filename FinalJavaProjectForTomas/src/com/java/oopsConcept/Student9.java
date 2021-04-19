package com.java.oopsConcept;

/**
 * @author Yadav Vinod, Method Overriding
 *
 */
class Bank {
	double getRateOfInterest() {
		return 0.0;
	}
}

class EquaBank extends Bank {
	double getRateOfInterest() {
		return 8.5;
	}
}

class AirBank extends Bank {
	double getRateOfInterest() {
		return 7.5;
	}
}

class UniCreditBank extends Bank {
	double getRateOfInterest() {
		return 7.0;
	}
}

public class Student9 {
	public static void main(String[] args) {
		EquaBank equa = new EquaBank();
		System.out.println("Rate OfI nterest of Equa Bank : " + equa.getRateOfInterest());
		AirBank air = new AirBank();
		System.out.println("Rate OfI nterest of Air Bank: " + air.getRateOfInterest());
		UniCreditBank uni = new UniCreditBank();
		System.out.println("Rate OfI nterest of UniCredit Bank: " + uni.getRateOfInterest());
	}

}
