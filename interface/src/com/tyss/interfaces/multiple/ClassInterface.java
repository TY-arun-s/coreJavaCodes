package com.tyss.interfaces.multiple;

public class ClassInterface implements Game, Office {

	@Override
	public void work() {
		System.out.println("Working");
	}

	@Override
	public void play() {
		System.out.println("Playing");

	}

}
