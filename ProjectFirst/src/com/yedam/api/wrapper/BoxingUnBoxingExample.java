package com.yedam.api.wrapper;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		//Boxing
		Integer obj = new Integer(100);
		Integer obj1 = new Integer("200");
		Integer obj2 = Integer.valueOf("300");
		
		//unboxing
		int value1 = obj.intValue();
		int value2 = obj1.intValue();
		int value3 = obj2.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}
