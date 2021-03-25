package com.tyss.inheritance.multilevel;

public class Calculator {
	
	void sum(int a, int b) {
		System.out.println("Sum is " + (a += b));
	}

	void product(int a, int b) {
		System.out.println(" Product is " + (a *= b));
	}

	void div(int a, int b) {
		System.out.println("Divident is " + (a /= b));
	}

	void sub(int a, int b) {
		System.out.println("Subtration value is " + (a -= b));
	}

}
