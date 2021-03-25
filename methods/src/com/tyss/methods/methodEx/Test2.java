package com.tyss.methods.methodEx;

public class Test2 {
	int salary;
	String name;

	public Test2(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 100;

		if (num1 == num2) {
			System.out.println("num1 == num2");
		} else {
			System.out.println("num1 != num2");
		}
	}

}
