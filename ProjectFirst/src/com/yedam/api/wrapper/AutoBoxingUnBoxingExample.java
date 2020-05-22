package com.yedam.api.wrapper;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		//자동   Unboxing
		Integer obj = 100;
		System.out.println("value: "+obj.intValue());
		
		//대입시자동Unboxing
		int value = obj;
		System.out.println("value: "+ value);
		
		//연산시 자동Unboxing
		int result = obj + 100;
		System.out.println("result: "+result);
		
	}
}
