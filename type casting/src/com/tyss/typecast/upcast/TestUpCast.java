package com.tyss.typecast.upcast;

public class TestUpCast {

	public static void main(String[] args) {
		// UpCasting:Creating object of SubClass and assigning a reference variable of Parent Class.
		//In UpCasting we cannot access the SubClass methods.
		UpCastA a = new UpCastB();
		a.doStuff();
		
		//DownCasting:The instance of SubClass refers to the instance of the Parent Class.
		UpCastB b=(UpCastB) a;
		b.doStuff();
		b.designation();
		
	}

}
