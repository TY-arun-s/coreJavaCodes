package com.tyss.constructor.superConst;

public class ParaConst {
int id;
String name;
ParaConst(int id, String name){
	super();
	this.id=id;
	this.name=name;
	System.out.println("Parameterized constructor");
}
}
