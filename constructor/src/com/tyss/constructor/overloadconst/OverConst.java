package com.tyss.constructor.overloadconst;

public class OverConst {

	 OverConst() {
		System.out.println("Default Constructor");
	}
OverConst(int x){
	System.out.println("Single Argument Constructor"+x);
}
OverConst(double x, double y){
	System.out.println("Multi Argument Constructor"+x+" "+y);
}
}
