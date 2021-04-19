/**
 * 
 */
package com.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Yadav Vinod, methods of stream
 *
 */
class Emp1 {
	int id;
	String name, address;
	double salary;

	public double getSalary() {
		return salary;
	}

	Emp1(int id, String name, String address, double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
}

public class Student1 {
	public static void main(String[] args) {
		List<Emp1> empList = new ArrayList<Emp1>();
		Emp1 e1 = new Emp1(101, "Sohan", "Mumbai", 50000);
		Emp1 e2 = new Emp1(102, "Satish", "Bhopal", 40000);
		Emp1 e3 = new Emp1(103, "Saloni", "Deoria", 35000);
		Emp1 e4 = new Emp1(104, "Shreya", "Jokaha", 30000);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		List<Double> salaryList = new ArrayList<Double>();
		System.out.println("Solving the purpose without stream.");
		for (Emp1 emp : empList) {
			if (emp.salary < 40000) {
				salaryList.add(emp.salary);
			}
		}
		System.out.println();
		
		System.out.println("List of Salary less than 40,000: " + salaryList);
		System.out.println();
		
		System.out.println("Same work with stream");
		List<Double> salaryList1 = empList.stream()
				.filter(p -> p.salary < 40000)
				.map(p -> p.salary)
				.collect(Collectors.toList());
		System.out.println("List of Salary less than 40,000: " + salaryList1);
		System.out.println();
		
		System.out.println("ForEach Loop");
		empList.stream()
		.filter(p->p.salary==30000)
		.forEach(p->System.out.println(p.name+" "+p.address));
		System.out.println();
		
		System.out.println("reduce method ");
		double totalSalary=empList.stream()
				.map(p->p.salary)
				.reduce(0.0, (sum,salary)->sum+salary);
		System.out.println("Total Salary of all the employees: "+totalSalary);
		System.out.println();
		
		System.out.println("Again reduce method");
		double totalSalary1=empList.stream()
				.map(p->p.salary)
				.reduce(0.0, Double::sum);
		System.out.println("Total Salary of the employees different way: "+totalSalary1);
		System.out.println();
		
		System.out.println("sum with summingDouble methods");
		double totalSalary3=empList.stream()
				.collect(Collectors.summingDouble(p->p.salary));
		System.out.println("Sum salary of all employee: "+totalSalary3);
		System.out.println();
		
		System.out.println("Maximum salary of Employee");
		Emp1 emp1=empList.stream()
				.max((employee1,employee2)->employee1.salary>employee2.salary?1:-1).get();
		System.out.println("Maximum salary of employee: "+emp1.id+" "+emp1.name+" "+emp1.address+" "+emp1.salary);
		System.out.println();
		
		System.out.println("Minimum Salary of Employee");
		Emp1 emp2=empList.stream()
				.min((employee1,employee2)->employee1.salary>employee2.salary?1:-1).get();
		System.out.println("Minimum salary of Employee: "+emp2.id+" "+emp2.name+" "+emp2.address+" "+emp2.salary);
		System.out.println();
		
		System.out.println("Maximum Salary with min");
		Emp1 emp3=empList.stream()
				.min((employee1, employee2)->employee1.salary<employee2.salary?1:-1).get();
		System.out.println("Maximum Salary with min method: "+emp3.id+" "+emp3.name+" "+emp3.address+" "+emp3.salary);
		System.out.println();
		
		System.out.println("Minimum salary with max");
		Emp1 emp4=empList.stream()
				.max((employee1,employee2)->employee1.salary<employee2.salary?1:-1).get();
		System.out.println("Minimum salary with max method: "+emp4.id+" "+emp4.name+" "+emp4.address+" "+emp4.salary);
		System.out.println();
		
		System.out.println("count method ");
		long count=empList.stream()
				.filter(p->p.salary<=35000)
				.count();
		System.out.println("No of employee whose salary is less than and equals 35000: "+count);
		System.out.println();
		
		System.out.println("Employee Salary into Set");
		Set<Double> setSalary=empList.stream()
				.filter(p->p.salary>=3000)
				.map(p->p.salary)
				.collect(Collectors.toSet());
		System.out.println("Set of Salary: "+setSalary);
		System.out.println();
		
		System.out.println("Converting empList into Map");
		Map<Integer, String> empMap=empList.stream()
				.collect(Collectors.toMap(p->p.id, p->p.name));
		System.out.println("All the key and values of map: "+empMap);
		System.out.println();
		
		System.out.println("Method Reference in stream");
		List<Double> salaryList2=empList.stream()
				.filter(p->p.salary>40000)
				.map(p->p.getSalary())
				.collect(Collectors.toList());
		System.out.println("List of Salary by Method Reference "+salaryList2);
		System.out.println();
		
		System.out.println("Stream filter() example");
		empList.stream()
		.filter(p->p.salary>=30000)
		.map(p->p.salary)
		.forEach(System.out::println);
		
	}
}

