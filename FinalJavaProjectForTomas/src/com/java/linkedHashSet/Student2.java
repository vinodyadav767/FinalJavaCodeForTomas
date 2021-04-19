/**
 * 
 */
package com.java.linkedHashSet;

import java.util.LinkedHashSet;

/**
 * @author Yadav Vinod, Student example in LinkedHashSet
 *
 */
class Student {
	int id;
	String name, address, rollNo;
	double fee;

	Student(int id, String name, String address, String rollNo, double fee) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.rollNo = rollNo;
		this.fee = fee;
	}
}

public class Student2 {
	public static void main(String[] args) {
		LinkedHashSet<Student> lhs = new LinkedHashSet<Student>();
		Student s1 = new Student(101, "Saloni", "Bardiha", "BT10", 1000);
		Student s2 = new Student(102, "Ansh", "Lerha", "BT01", 1500);
		Student s3 = new Student(103, "Shaumya", "Lerha", "BT11", 2000);
		Student s4 = new Student(104, "Avinash", "Jokaha", "BT03", 2500);
		Student s5 = new Student(105, "Addi", "Jokaha", "BT04", 2000);
		Student s6 = new Student(106, "Anand", "Jokaha", "BT06", 1200);
		lhs.add(s1);
		lhs.add(s2);
		lhs.add(s3);
		lhs.add(s4);
		lhs.add(s5);
		lhs.add(s6);
		System.out.println("Details of all the students: ");
		for (Student item : lhs)
			System.out.println(item.id + " " + item.name + " " + item.address + " " + item.rollNo + " " + item.fee);
	}
}
