package com.tyss.inheritance.parenttochild;

public class ParentRefernce {

	public static void main(String[] args) {
		// Bike b = new Bike();
		
		// Creating a reference var of Parent class(i.e Cycle) and assigning the object
		// of Child class(i.e Bike)
		Cycle b = new Bike();

		b.move();
		//b.start(); //NOT POSSIBLE
		System.out.println(b.cost = 10000);
	}

}
