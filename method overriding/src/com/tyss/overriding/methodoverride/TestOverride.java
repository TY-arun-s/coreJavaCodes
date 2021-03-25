package com.tyss.overriding.methodoverride;

public class TestOverride {

	public static void main(String[] args) {
		Father f=new Father();
		f.bike();
		Son s=new Son();
		s.bike();
		
		Father f1=new Son();
		f1.bike();
	}

}
