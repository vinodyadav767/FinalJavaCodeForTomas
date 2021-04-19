/**
 * 
 */
package com.java.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yadav Vinod, Employee example using List
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

public class Student3 {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		Employee e1 = new Employee(101, "Sohan Yadav", "Mumbai", 50000);
		Employee e2 = new Employee(102, "Satish Yadav", "Bhopal", 40000);
		list.add(e1);
		list.add(e2);
		System.out.println("Iterate all the employee");
		for (Employee e : list) {
			System.out.println(e.id + " " + e.name + " " + e.city + " " + e.salary);
		}
	}
}
