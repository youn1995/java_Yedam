package com.yedam.classes;

public class Car {
	
	String model;
	int maxSpeed;
	
	
	public Car() {
		maxSpeed = 100;
	}
	
	public Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public Car(String model) {
		this.model = model;
	}
	
	public Car(String model, int maxSpeed) {
		this.model =model;
		this.maxSpeed = maxSpeed;
	}
	
	
	void showInfo() {
		System.out.println("Model: " + model + " ,Maxspeed: "+ maxSpeed);
	}
	
}
