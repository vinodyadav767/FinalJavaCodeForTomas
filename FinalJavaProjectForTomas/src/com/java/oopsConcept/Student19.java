/**
 * 
 */
package com.java.oopsConcept;

/**
 * @author Yadav Vinod, Interface
 *
 */
interface Shape {
	void drawShape();
}

class Triangle implements Shape {
	public void drawShape() {
		System.out.println("drawing triangle.");
	}
}

class Rectangle implements Shape {
	public void drawShape() {
		System.out.println("drawing rectangle.");
	}
}

class Circle implements Shape {
	public void drawShape() {
		System.out.println("drawing circle.");
	}
}

public class Student19 {
	public static void main(String[] args) {
		Shape s1 = new Triangle();
		s1.drawShape();
		Shape s2 = new Rectangle();
		s2.drawShape();
		Shape s3 = new Circle();
		s3.drawShape();
	}
}
