package com.tyss.sample1.test;

public class ArraysDemo {
public static void main(String[] args) {
	int[] a=new int[4];
	a[0]=3;
	a[1]=4;
	a[2]=5;
	a[3]=6;
	
	//DISPLAYING WITHOUT LOOP
//	System.out.println(a[0]);
//	System.out.println(a[1]);
//	System.out.println(a[2]);
//	System.out.println(a[3]);
	
	//DISPLAYING USING FOR LOOP
//	for(int i=0;i<a.length;i++) {
//		System.out.println(a[i]); //Displaying elements of array
//	}
	
	//FOR EACH LOOP
	for(int arr:a) {
		System.out.println(arr);
	}
	
	//DECLARING A NEW ARRAY
	int []k=new int[5];
	k[0]=90;
	System.out.println(k[0]);
	
	//DECLARING A NEW ARRAY
		int []p=new int[5];
		p[0]=180;
		System.out.println(p[0]);
	
		
		int[] t= {45,66,78};
		System.out.println(t);
	
		
	
	}
}
