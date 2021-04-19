package com.java.oopsConcept;

/**
 * @author Yadav Vinod, inheritance in Java
 *
 */
class Animal {
	void eat() {
		System.out.println("Eating the food");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Dog can bark.");
	}
}

class Cat extends Dog {
	void meau() {
		System.out.println("Cat can meau");
	}
}

public class Student7 extends Cat {
	public static void main(String[] args) {
		Student7 s1 = new Student7();
		s1.eat();
		s1.bark();
		s1.meau();
	}

}
