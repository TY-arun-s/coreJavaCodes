package com.tyss.specifier.privates;

public class AccSpecifier {
	private int i = 10;

	private void doStuff() {
		System.out.println("Private method");
	}

	
	private AccSpecifier() {
		super();
		this.i = i;
	}

}
