/**
 * 
 */
package com.java.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yadav Vinod, Employee example of Map.
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
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		Employee e1 = new Employee(101, "Sohan Yadav", "Mumbai", 50000);
		Employee e2 = new Employee(102, "Satish Yadav", "Bhopal", 40000);
		map.put(1, e1);
		map.put(2, e2);
		System.out.println("Iterate all the employee");
		for (Map.Entry<Integer, Employee> m : map.entrySet()) {
			int key = m.getKey();
			System.out.println("Key: " + key);
			Employee e = m.getValue();
			System.out.println(e.id + " " + e.name + " " + e.city + " " + e.salary);
		}
	}
}
