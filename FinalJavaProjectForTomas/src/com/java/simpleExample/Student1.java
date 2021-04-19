/**
 * 
 */
package com.java.simpleExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Yadav Vinod, Simple Example 1
 *
 */
class Employee {
	int id;
	String name, city;
	double salary;

	Employee(int id, String name, String city, double salary) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
}

public class Student1 {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		Employee e1 = new Employee(101, "Saloni Yadav", "GKP", 50000);
		Employee e2 = new Employee(102, "Shreya Yadav", "Deoria", 30000);
		Employee e3 = new Employee(103, "Shaumya Yadav", "Lucknow", 35000);
		Employee e4 = new Employee(104, "Ansh Yadav", "Delhi", 40000);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.forEach(p -> System.out.println(p.id + " " + p.name + " " + p.city + " " + p.salary));
		System.out.println();

		System.out.println("Sorting the Employee basis of name.");
		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});
		for (Employee e : list) {
			System.out.println(e.id + " " + e.name + " " + e.city + " " + e.salary);
		}
		System.out.println();

		System.out.println("Using stream filter.");
		list.stream().filter(p -> p.salary > 35000)
				.forEach(p -> System.out.println(p.id + " " + p.name + " " + p.city + " " + p.salary));
	}
}
