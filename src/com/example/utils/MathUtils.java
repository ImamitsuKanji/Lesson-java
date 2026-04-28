package com.example.utils;

public class MathUtils {
	int a;
	int b;
	
	int add(int a, int b) {
		return a + b;

	}
	
	public static void main(String[] args) {
		MathUtils mathUtils = new MathUtils();
		int total = mathUtils.add(4, 5);
		System.out.println(total);
	}

}
