package com.tyss.collection.arraylists;

import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		array.add(10);
		array.add(20);
		array.add(40);
		array.add(true);
		System.out.println(array);
		
		System.out.println(array.contains(20));
		
	}
}
