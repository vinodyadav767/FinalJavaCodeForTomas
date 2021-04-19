package com.java.oopsConcept;

/**
 * @author Yadav Vinod
 *Object Initialization through method
 *Use of Aggregation  for address;
 */
class Address {
	String city, state, country;

	Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

public class Student2 {
	int id;
	String name;
	Address address;
	double fee;

	void addStudent(int id, String name, Address address, double fee) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.fee = fee;
	}

	void printStudent() {
		System.out.println(id + " " + name + " " + fee);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {
		Address address1 = new Address("Bhopal", "Madhya Pradesh", "India");
		Address address2 = new Address("Mumbai", "Maharastra", "India");
		Student2 s1 = new Student2();
		s1.addStudent(101, "Sohan", address2, 45000);
		Student2 s2 = new Student2();
		s2.addStudent(102, "Satish", address1, 35000);
		s1.printStudent();
		System.out.println();
		s2.printStudent();
	}
}
