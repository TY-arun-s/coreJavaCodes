package com.tyss.hasa.hasademo;

public class Employee {
	int eid;
	String name;
	int salary;
	Address address;

	// alt+shift+s+o ==> Creates a constructor

	public Employee(int eid, String name, int salary, Address address) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
}
