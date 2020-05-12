package com.yedam.classes;

public class Calculator {
	String model;
	
	void powerOn() {
		System.out.println("POWER ON");
	}
	
	int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	double sum(double num1, double num2) {
		return num1 + num2;
	}
	
	
	
	void println(String str) {
		System.out.println("Result: " + str);
	}
	
	void println(int str) {
		System.out.println("Result: " + str);
	}
	
	void println(double str) {
		System.out.println("Result: " + str);
	}
	
	double getAreaRectangle(double width, double height) { //매소드 오버로딩
		return width * height;
	}
	
	double getAreaRectangle(double sameWidth){  //매소드 오버로딩
		return sameWidth * sameWidth;
	}
	
	
	
	public Calculator() {
		
	}
	
}
