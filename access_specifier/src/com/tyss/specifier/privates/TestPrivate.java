package com.tyss.specifier.privates;

public class TestPrivate {
	public static void main(String[] args) {
		AccSpecifier a = new AccSpecifier();
		a.doStuff(); // Cannot access private method/variable in other class
	}
}
