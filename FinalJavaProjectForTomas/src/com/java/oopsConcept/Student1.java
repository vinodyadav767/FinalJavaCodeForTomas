package com.java.oopsConcept;

/**
 * @author Yadav Vinod, Object initialization through a constructor
 *
 */
public class Student1 {
	int id;
	String name, city;
	double salary;

	Student1(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	Student1(int id, String name, String city, double salary) {
		this(id, name, city);
		this.salary = salary;
	}

	void prinData() {
		System.out.println(id + " " + name + " " + city + " " + salary);
	}

	public static void main(String[] args) {
		Student1 s1 = new Student1(101, "Sohan Yadav", "Mumbai");
		Student1 s2 = new Student1(102, "Satish Yadav", "Bhopal", 40000);
		s1.prinData();
		s2.prinData();
	}

}
