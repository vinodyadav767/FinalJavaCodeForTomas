/**
 * 
 */
package com.java.oopsConcept;

/**
 * @author Yadav Vinod, Encapsulation
 *
 */
public class Student20 {
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 100 && id < 200) {
			this.id = id;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	String name;
	double fee;

	public static void main(String[] args) {
		Student20 s1 = new Student20();
		Student20 s2 = new Student20();
		s1.setId(101);
		s1.setName("Sohan");
		s1.setFee(1500);
		s2.setId(102);
		s2.setName("Satish");
		s2.setFee(2000);
		System.out.println(s1.getId() + " " + s1.getName() + " " + s1.getFee());
		System.out.println(s2.getId() + " " + s2.getName() + " " + s2.getFee());
	}
}
