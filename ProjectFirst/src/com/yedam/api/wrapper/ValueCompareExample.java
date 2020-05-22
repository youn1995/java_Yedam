package com.yedam.api.wrapper;

public class ValueCompareExample {
	public static void main(String[] args) {
		System.out.println("[-128~127초과값일경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		System.out.println("== 결과" +(obj1 == obj2));
		System.out.println("언박싱후 결과"+(obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과"+(obj1.equals(obj2)));
		
		System.out.println("[-128~127이내일경우]");
		Integer obj3 = 30;
		Integer obj4 = 30;
		
		System.out.println("== 결과" +(obj3 == obj4));
		System.out.println("언박싱후 결과"+(obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과"+(obj3.equals(obj4)));
	}
}
