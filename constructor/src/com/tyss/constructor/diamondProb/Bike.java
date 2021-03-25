package com.tyss.constructor.diamondProb;

public class Bike extends Vehical {
int maxSpeed=160;
void speed() {
	//here, "super" is helping in getting the value from Parent class
	System.out.println("Max Speed "+ super.maxSpeed);
}
}
