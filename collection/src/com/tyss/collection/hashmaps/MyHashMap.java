package com.tyss.collection.hashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MyHashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("id", 100);
		hm.put("sal", 10000);
		hm.put("sal", 100000);
		System.out.println(hm);
	
//		Set<String> s = hm.keySet();
//		System.out.println(s);
//		
//		int id = hm.get("id");
//		System.out.println(id);
		
//		Iterator<String> it = s.iterator();
//		while(it.hasNext()) {
//			String s1 = it.next();
//			System.out.println(s1);
//		}
	}
}
