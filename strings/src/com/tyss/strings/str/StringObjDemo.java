package com.tyss.strings.str;

public class StringObjDemo {

	public static void main(String[] args) {
		String s = new String("Arun");
		String s1 = new String("Arun");
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
	}

}
