package com.tyss.exceptions.trycatch;

public class TestAge {
	public void checkAge(int a) {
		if (a < 18) {
			throw new InvalidAge("below 18");
		} else {
			System.out.println("welcome to cast your vote");
		}
	}
}
