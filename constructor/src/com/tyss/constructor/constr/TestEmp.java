package com.tyss.constructor.constr;

public class TestEmp {
public static void main(String[] args) {
//	Employee e=new Employee();
//	e.id=100;
//	e.name="varun";
//	e.email="varun@gmail.com";
//	System.out.println(e.id);
//	System.out.println(e.name);
//	System.out.println(e.email);

//Parameterized  Constructor	
Employee emp=new Employee(101,"arun","arun@gmail.com");
System.out.println(emp.id);
System.out.println(emp.name);
System.out.println(emp.email);

Employee emp1=new Employee(102,"varun","varun@gmail.com");
System.out.println(emp1.id);
System.out.println(emp1.name);
System.out.println(emp1.email);
	
}
}
