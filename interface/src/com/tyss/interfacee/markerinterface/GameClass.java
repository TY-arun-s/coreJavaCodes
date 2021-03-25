package com.tyss.interfacee.markerinterface;

public class GameClass {
	public static void main(String[] args) {
		//Lambda Expression
		FuncInterface p = () -> {
			System.out.println("Playing");
		};
		p.play();
	}
}
