package com.tyss.sample1.test;

public class MethodsDemo {
//Method-1:	//USING RETURN TYPE:int, we have to return something.
	public static int sum(int a,int b) {
		int c = a + b;
		return c;
	}
	
//Method-2:	//USING VOID, when we use void we no need to return anything
	public static void sum2(int p, int q) {
		int r=p+q;
		System.out.println("Sum2 Result is "+r);
		
	}
	
//Main Method
public static void main(String[] args) {
	
	int result=sum(45,5);
	System.out.println("Result is "+result);
	
	sum2(2,4);
}
}
