/**
 * 
 */
package com.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author Yadav Vinod
 *
 */
class Employee1 {
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcity() {
		return city;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	String name, city;
	double salary;

	Employee1(int id, String name, String city, double salary) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
}

public class Student2 {
	public static void main(String[] args) {
		List<Employee1> empList = new ArrayList<Employee1>();
		Employee1 e1 = new Employee1(101, "Sohan", "Mumbai", 50000);
		Employee1 e2 = new Employee1(102, "Satish", "Bhopal", 45000);
		Employee1 e3 = new Employee1(103, "Saloni", "Deoria", 40000);
		Employee1 e4 = new Employee1(104, "Shreya", "Deoria", 35000);
		Employee1 e5 = new Employee1(105, "Rahul", "Mumbai", 30000);
		Employee1 e6 = new Employee1(106, "Rohit", "Mumbai", 25000);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		List<String> nameList = empList.stream().map(p -> p.getName()).collect(Collectors.toList());
		System.out.println("List of names of Employees: " + nameList);
		System.out.print("List of names of Employees: ");
		nameList.forEach(p -> System.out.print(p + " "));
		System.out.println();
		Set<String> nameSet = empList.stream().map(Employee1::getName).collect(Collectors.toSet());
		System.out.println("Set of Names of Employee: " + nameSet);
		System.out.print("Set of names of Employees: ");
		nameSet.forEach(p -> System.out.print(p + " "));
		Set<String> namesTreeSet = empList.stream().map(p -> p.getName())
				.collect(Collectors.toCollection(TreeSet::new));
		System.out.println("List of Names of employee: " + namesTreeSet);
		System.out.print("List of names: ");
		namesTreeSet.forEach(p -> System.out.print(p + " "));
		Map<String, Double> empMap = empList.stream()
				.collect(Collectors.toMap(Employee1::getName, Employee1::getSalary));
		System.out.println("Name and Salary of each Employee: " + empMap);
		System.out.println("Name and salary of each employee: ");
		empMap.entrySet().forEach(p -> System.out.println(p.getKey() + " " + p.getValue()));
		String names = empList.stream().map(p -> p.getName()).collect(Collectors.joining(", "));
		System.out.println("Name of all employee: " + names);
		double totalSalary = empList.stream().collect(Collectors.summingDouble(p -> p.getSalary()));
		System.out.println("Total salary of all employees: " + totalSalary);
		Map<String, List<Employee1>> mapListEmp = empList.stream().collect(Collectors.groupingBy(p -> p.getcity()));
		mapListEmp.entrySet().forEach(p -> {
			System.out.println("City: " + p.getKey());
			p.getValue().forEach(a -> System.out.println(a.id + " " + a.name + " " + a.salary));
		});

	}
}
