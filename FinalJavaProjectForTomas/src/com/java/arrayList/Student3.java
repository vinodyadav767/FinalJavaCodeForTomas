/**
 * 
 */
package com.java.arrayList;

import java.util.ArrayList;

/**
 * @author Yadav Vinod, Employee example in ArrayList
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
		ArrayList<Employee> arrayList=new ArrayList<Employee>();
		Employee e1 = new Employee(101, "Sohan Yadav", "Mumbai", 50000);
		Employee e2 = new Employee(102, "Satish Yadav", "Bhopal", 40000);
		Employee e3 = new Employee(101, "Saloni Yadav", "Deoria", 30000);
		arrayList.add(e1);
		arrayList.add(e2);
		arrayList.add(e3);
		System.out.println();
		System.out.println("Iterate all the employee");
		for(Employee e: arrayList)
		{
			System.out.println(e.id+" "+e.name+" "+e.city+" "+e.salary);
		}
	}
}
