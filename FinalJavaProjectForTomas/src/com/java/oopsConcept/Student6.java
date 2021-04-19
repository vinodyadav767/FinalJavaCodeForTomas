package com.java.oopsConcept;

/**
 * @author Yadav Vinod use of static keyword
 *
 */
public class Student6 {
	int id;
	String name, city;
	static String uniName = "UTB";
	static int count = 0;

	Student6(int id, String name, String city) {
		count++;
		this.id = id;
		this.name = name;
		this.city = city;
	}

	static void changeUniName() {
		uniName = "University of Miskolc";
	}

	void printData() {
		System.out.println(id + " " + name + " " + city + " " + uniName);
	}

	public static void main(String[] args) {
		Student6 s1 = new Student6(101, "Sohan Yadav", "Mumbai");
		Student6 s2 = new Student6(102, "Satish Yadav", "Bhopal");
		s1.printData();
		s2.printData();
		System.out.println("Count " + count);
	}
}
