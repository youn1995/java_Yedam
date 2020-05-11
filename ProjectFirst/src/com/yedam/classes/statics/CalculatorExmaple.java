package com.yedam.classes.statics;

public class CalculatorExmaple {
	public static void main(String[] args) {
		Calculator.pi = 3.14; // static 필드, static matod
		System.out.println(Calculator.sum(10, 20));
	}
}
