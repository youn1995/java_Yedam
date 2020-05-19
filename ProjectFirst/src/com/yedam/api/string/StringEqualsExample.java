package com.yedam.api.string;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("KIM");
		String strVar2 = "KIM";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 string 객체를 참조");
		} else {
			System.out.println("다른 string 객체를 참조");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
	}
}
