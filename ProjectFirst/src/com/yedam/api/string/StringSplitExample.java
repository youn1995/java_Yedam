package com.yedam.api.string;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "홍길동&이수홍,김동동,김자바-최수박";
		String[] names = text.split("&|,|-");
		for(String name : names) {
			System.out.println(name);
		}
	}
}
