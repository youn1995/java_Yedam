package com.yedam.exceptions;

public class NullPointerExceptions {
	public static void main(String[] args) {
		String str = "Hello";
		
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			
		System.out.println("프로그램 종료");
	}
}
