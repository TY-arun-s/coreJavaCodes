package com.tyss.inheritance.multilevel;

public class TestCalc {

	public static void main(String[] args) {
//		ScientificCalc calc = new ScientificCalc();
		SpaceCalc calc=new SpaceCalc();
		calc.div(15,6);
		calc.sum(10,10);
		calc.product(13,2);
		calc.sub(13,6);
		calc.square(2,2);
		calc.mod(90,8);
	}

}
