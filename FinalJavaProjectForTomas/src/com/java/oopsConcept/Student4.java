package com.java.oopsConcept;

/**
 * @author Yadav Vinod, this keyword as a argument
 *
 */
class S4 {
	Student4 s;

	S4(Student4 s) {
		this.s = s;
	}

	void printVariable() {
		System.out.println(s.var);
	}
}

public class Student4 {
	int var = 100;

	void printFirstName(Student4 s) {
		System.out.println("Sohan");
	}

	void printLastName() {
		printFirstName(this);
		System.out.println("Yadav");
	}

	Student4() {
		S4 s1 = new S4(this);
		s1.printVariable();
	}

	public static void main(String[] args) {
		Student4 s2 = new Student4();
		s2.printLastName();
	}
}
