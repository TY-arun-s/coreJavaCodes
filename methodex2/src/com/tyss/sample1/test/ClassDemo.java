package com.tyss.sample1.test;

public class ClassDemo {
String color="blue";
String name="Parker";
public void write() {
	System.out.println("its used to write");
}
public static void main(String[] args) {
	//Creating a object for class "ClassDemo" 
	//To access class properties- We create object and refer it to Reference Variable ("p" here) to access them.
	ClassDemo p=new ClassDemo();
	System.out.println("pen color is "+p.color);
	System.out.println("pen name is "+p.name);
//	System.out.println("Pen's Behaviour "+p.write());
	p.write();
}
}
