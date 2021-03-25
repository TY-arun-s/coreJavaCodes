package com.tyss.interfacee.interfacedemo;

public abstract class NormalCalculator implements Calculator {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub");
	}

	@Override
	public abstract void div();

	@Override
	public abstract void mul();

}
