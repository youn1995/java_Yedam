package com.yedam.classes;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.powerOn();
		int result1 = cal.sum(10, 50);
		double result2 = cal.sum(10.1, 50.2);
		
		cal.println("30");
		cal.println(result1);
		cal.println(result2);
		
		double area1 = cal.getAreaRectangle(5.4, 3);
		cal.println(area1);
		
		double area2 = cal.getAreaRectangle(5.4);
		cal.println("정사각형 넓이는 "+area2);
	}

}
