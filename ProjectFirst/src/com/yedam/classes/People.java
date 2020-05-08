package com.yedam.classes;

public class People {
	// 속성(필드) 3가지
	String name;
	String contry;
	int age;
	
	People(String name, String contry, int age) {
		this.name = name;
		this.contry = contry;
		this.age = age;
	}
	
	//기능(메소드) 3가지
	void see(String str) {
		System.out.println(str+"를 본다.");
	}
	
	void eat(String str) {
		System.out.println(str+"를 먹는다.");
	}
	
	void run(double dob) {
		System.out.println(dob + "km 만큼 달렸다.");
	}
	
	void showInfo() {
		System.out.println("name: "+ name +", contry: "+contry+", age: "+age);
	}
	
}
