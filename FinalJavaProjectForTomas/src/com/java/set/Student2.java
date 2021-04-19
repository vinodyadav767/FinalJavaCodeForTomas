/**
 * 
 */
package com.java.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Yadav Vinod, Employee example in set
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

public class Student2 {
	public static void main(String[] args) {
		Set<Employee> set=new HashSet<Employee>();
		Employee e1 = new Employee(101, "Sohan Yadav", "Mumbai", 50000);
		Employee e2 = new Employee(102, "Satish Yadav", "Bhopal", 40000);
		set.add(e1);
		set.add(e2);
		System.out.println("Iterate all the employee");
		for (Employee e : set) {
			System.out.println(e.id + " " + e.name + " " + e.city + " " + e.salary);
		}
	}
}
