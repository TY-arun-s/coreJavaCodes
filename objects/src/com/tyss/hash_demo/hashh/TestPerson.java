package com.tyss.hash_demo.hashh;

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person(1, "Arun", "arun@testyantra.com");
//		System.out.println(p);
//		System.out.println(p.toString());

//Here, we are making use of equals() method which compares and returns boolean value.
		// Person p1=new Person(2, "Sohan", "sohan@gmail.com");
		
		//Here,its comparing the object p and p1's address, not value.
Person p1 = new Person(1, "Arun", "arun@testyantra.com");
		boolean result = p.equals(p1);
		System.out.println("Result==" + result);
		System.out.println(p==p1);
		
		//Here,its matching the values.
//		Person p1=p;
//		System.out.println(p1==p);
		
	}

}