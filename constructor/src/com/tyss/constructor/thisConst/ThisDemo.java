package com.tyss.constructor.thisConst;

public class ThisDemo {
	ThisDemo() {
		//this is used to call the constructor within the class.
		this(20);
		System.out.println("Default const");
	}

	ThisDemo(int p) {
		this(20, 70);
		System.out.println("parameterized const" +p);
	}

	ThisDemo(int a, int b) {
		System.out.println("two parameterized  const"+a+ " "+ b);
	}
}
