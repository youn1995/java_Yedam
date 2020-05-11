package com.yedam.classes;

public class Student {
	// 이름,키,나이,몸무게 //속성 -- 필드

	String name;
	int age;
	double height;
	double weight;
	
	//생성자를 유저가 만들면 디폴트 생성자는 만들지않음 직접만들어야함
	//(생성자) -> 필드의 초기값지정
	Student() {
		System.out.println("생성자 호출");
	}
	
	Student(String name) {
		this.name = name; //this는 이 필드
	}
	
	Student(String name, int age, double height ){
		//this(name, age);
		this.height = height;
	}
	
	
	//공부한다, 먹는다. 운동한다 // 기능 -- 메소드
	void study() {
		System.out.println("공부하는중");
	}
	
	void exercise() {
		System.out.println("운동 하는중");
	}
	
	void eat(String str) {
		System.out.println(str+"을 먹는 중");
	}
	
}
