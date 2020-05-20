package com.yedam.exceptions;


public class NullPointerExceptions {
	public static void main(String[] args) {
		String str = "null";
		
		try {
		System.out.println(str.toString()); //runtime exception
		} catch (NullPointerException e) {
			System.out.println("널값참조");
		}
		try {
			Class.forName("java.lang.String"); //exception
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			
		System.out.println("프로그램 종료");
	}
}
