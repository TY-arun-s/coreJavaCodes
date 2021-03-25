package com.tyss.abstractclass.abstractt;

public abstract class SampleAbstClass extends AbstClass {

	public SampleAbstClass(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	// We need to implement the method which are unimplemented in the Parent Class
	// in Child class
	@Override
	public void doStuff() {
		System.out.println("Abstract method implemented");

	}

	public abstract void doStuff1();

}
