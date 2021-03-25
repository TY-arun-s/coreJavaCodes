package com.tyss.interfaces.inter;

public interface NewInterface {
	//From version above 1.8v we can have concrete method in interface.
	default void myMethod() {}

	void myMethod1();

	void myMethod2();
}
