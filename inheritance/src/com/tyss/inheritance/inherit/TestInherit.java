package com.tyss.inheritance.inherit;

public class TestInherit {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.name="Arun"; //From Persons
		emp.pid=111; //From Persons
		emp.address(); //From Persons
		emp.email="arun@gmail.com";  //From Employee
		emp.designation(); //From Employee
System.out.println(emp.name);
System.out.println(emp.pid);
System.out.println(emp.email);
	}

}
