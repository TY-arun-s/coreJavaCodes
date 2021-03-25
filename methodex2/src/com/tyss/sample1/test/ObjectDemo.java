package com.tyss.sample1.test;

public class ObjectDemo {
public static void main(String[] args) {
	//Creating a object in this file for "ClassDemo.java"
	ClassDemo p=new ClassDemo();
	System.out.println("Pen color is "+p.color);
	System.out.println("pen name is "+p.name);
	p.write();
}
}
