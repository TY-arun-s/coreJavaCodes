package com.tyss.specifier.defaultt;
import com.tyss.specifier.privates.*;
class DefaultDemo {

	int a;

	void myMethod() {
		System.out.println("Default Access Specifier");
	} 

	 DefaultDemo(int a) {
		super();
		this.a = a;
	}

}
