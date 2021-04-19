/**
 * 
 */
package com.java.aggregation;

/**
 * @author Yadav Vinod, Aggregation
 *
 */
public class Employee {
	int id;
	String name;
	Address address;
	double salary;

	void addEmp(int id, String name, double salary, Address address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	void printData() {
		System.out.println(id + " " + name + " " + salary);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {
		Address add1 = new Address();
		Address add2 = new Address();
		add1.addAdress("Zlin", "Zlin", "Czeck Republic");
		add2.addAdress("Deoria", "U.P", "India");
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.addEmp(101, "Satish Yadav", 50000, add1);
		e2.addEmp(102, "Sohan Yadav", 60000, add2);
		e1.printData();
		e2.printData();
		
	}
}
