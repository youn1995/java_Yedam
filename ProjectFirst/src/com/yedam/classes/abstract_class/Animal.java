package com.yedam.classes.abstract_class;
//추상클래스
public abstract class Animal {
	String kind;
	
	public Animal(String kind) {
		this.kind = kind;
	}
	
	public void breathe() {
		System.out.println("숨을 쉰다");
	}
	
	public abstract void sound(); //추상메소드 메소드 정의만있고 구현하는 부분이 없음  자식클래스에서 무적권 구현해줘야함
	
}
