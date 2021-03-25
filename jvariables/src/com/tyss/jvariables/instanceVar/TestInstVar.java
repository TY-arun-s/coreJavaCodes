package com.tyss.jvariables.instanceVar;

public class TestInstVar {
	public static void main(String[] args) {
		InstVar r=new InstVar();
		System.out.println(r.a);
		System.out.println(r.age);
		System.out.println(r.name);
		System.out.println("----------------------------");
		
		//We are pointing two "Reference Variables" to a single heap memory here.
		//We are not creating a new object here but giving the object as reference (i.e.,r is referred to s, so s is pointing to the memory)
		InstVar s=r;
		s.a=400;
		s.age=45;
		s.name="Arjun";
		System.out.println(s.a);
		System.out.println(s.age);
		System.out.println(s.name);
	}

}
