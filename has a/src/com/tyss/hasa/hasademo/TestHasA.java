package com.tyss.hasa.hasademo;

public class TestHasA {

	public static void main(String[] args) {

		Address add = new Address(10, 12, "Nagarabhavi", "Bengaluru");
		Employee emp = new Employee(10, "Arun", 50000, add);
		System.out.println("Employee Id: " + emp.eid);
		System.out.println("Employee name: " + emp.name);
		System.out.println("Employee salary: " + emp.salary);
		System.out.println("Employee doorNo: " + emp.address.doorNo);
		System.out.println("Employee city: " + emp.address.city);
		System.out.println("Employee area: " + emp.address.area);
		System.out.println("Employee streetNo: " + emp.address.streetNo);
	}

}
