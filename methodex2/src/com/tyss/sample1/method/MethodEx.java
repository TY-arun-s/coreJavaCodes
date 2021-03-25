package com.tyss.sample1.method;

 class MethodEx {
public void dostuff() {
	System.out.println("do stuff");
}
public void dowork() {
	System.out.println("do work");
	dostuff();
}
}
