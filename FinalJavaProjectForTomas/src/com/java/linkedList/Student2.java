/**
 * 
 */
package com.java.linkedList;

import java.util.LinkedList;

/**
 * @author Yadav Vinod, LinkedList employee example
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
		LinkedList<Employee> ll=new LinkedList<Employee>();
		Employee e1 = new Employee(101, "Sohan Yadav", "Mumbai", 50000);
		Employee e2 = new Employee(102, "Satish Yadav", "Bhopal", 40000);
		ll.add(e1);
		ll.add(e2);
		System.out.println("Iterate all the employee");
		for(Employee e:ll)
		{
			System.out.println(e.id+" "+e.name+" "+e.city+" "+e.salary);
		}
	}
}
