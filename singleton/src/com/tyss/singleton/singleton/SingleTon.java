package com.tyss.singleton.singleton;

public class SingleTon {
	private static SingleTon singleton = null;

	private SingleTon() {
		// TODO Auto-generated constructor stub
	}

	public static SingleTon getInstance() {

		if (singleton == null) {
			singleton = new SingleTon();
			System.out.println("Obj created");
			return singleton;
		} else {
			System.out.println("Obj already exists");
			return singleton;
		}
	}
}
