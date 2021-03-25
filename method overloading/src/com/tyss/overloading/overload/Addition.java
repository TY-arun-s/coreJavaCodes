package com.tyss.overloading.overload;

public class Addition {
	//This is an example for method overloading
	//method overloading is where we have same method name with different parameters.
	
	//here we are changing the return type... then it is not a method overloading.
	void add(int x, int y) {
		double k=(x += y);
		System.out.println("first " + k );
	}

	void add(double x, double y) {
		System.out.println("Second " + (x += y));
	}

	void add(float x, float y) {
		System.out.println("third " + (x += y));
	}
}
