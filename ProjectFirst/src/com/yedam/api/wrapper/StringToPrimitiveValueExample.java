package com.yedam.api.wrapper;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("ture");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}
