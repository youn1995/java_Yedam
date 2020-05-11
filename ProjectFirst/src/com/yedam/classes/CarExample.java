package com.yedam.classes;

public class CarExample {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.model = "Sonata";
		c1.showInfo();
		
		Car c2 = new Car(200);
		c2.model = "M3";
		c2.showInfo();
		
		Car c3 = new Car("K5");
		c3.maxSpeed = 150;
		c3.showInfo();
		
		Car c4 = new Car("K3", 1000);
		c4.showInfo();
		
		
	}
}
