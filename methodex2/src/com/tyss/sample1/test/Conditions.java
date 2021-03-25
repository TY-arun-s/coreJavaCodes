package com.tyss.sample1.test;

public class Conditions {
	public static void main(String[] args) {
		//If-else
			int a=80;
			int b=80;
			if(a>b) {
				System.out.println("a is greater");
			}else if(b>a) {
				System.out.println("b is greater");
			}else {
				System.out.println("both are equal");
			}
			

		//Switch
		char grade='B';
		switch(grade){
		case 'A': System.out.println("FCD");
		break;
		case 'B': System.out.println("FC");
		break;	
		default:
			System.out.println("invalid input");
		}
	}
}
