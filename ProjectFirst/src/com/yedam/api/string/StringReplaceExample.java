package com.yedam.api.string;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "파이썬");
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
