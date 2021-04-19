/**
 * 
 */
package com.java.hashTable;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author Yadav Vinod, HashTable Employee Example
 *
 */
class Employee {
	int id;
	String name, address;
	double salary;

	Employee(int id, String name, String address, double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
}

public class Student1 {
	public static void main(String[] args) {
		Hashtable<Integer, Employee> ht = new Hashtable<Integer, Employee>();
		Employee e1 = new Employee(101, "Sohan Yadav", "Mumbai", 25000);
		Employee e2 = new Employee(102, "Satish Yadav", "Bhopal", 20000);
		ht.put(1, e1);
		ht.put(2, e2);
		for (Map.Entry<Integer, Employee> m : ht.entrySet()) {
			int key = m.getKey();
			Employee emp = m.getValue();
			System.out.println("Keys of Employees: " + key);
			System.out.println(emp.id + " " + emp.name + " " + emp.address + " " + emp.salary);
		}

	}
}
