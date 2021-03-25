package com.tyss.constructor.constr;

public class Employee {
	int id;
	String name;
	String email;
	
 Employee(int id, String name, String email) {
	 //"this" is assigning the values from parameterized constructor and assigning them to the global variable
	 this.id=id;
	this.name=name;
	this.email=email;
	}

}
