package com.yedam.classes.statics;

public class CarExample {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setSpeed(0);
		System.out.println("Speed: " + c1.getSpeed());
		
		c1.setSpeed(60);
		if(!c1.isStop()) {
			c1.setStop(true);
		}
		System.out.println("현재속도: "+c1.getSpeed());
	}
}
