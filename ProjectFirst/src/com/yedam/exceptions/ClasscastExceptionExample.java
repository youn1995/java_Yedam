package com.yedam.exceptions;

abstract class Animal {
	abstract void sound();
	
}
class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("bowbow");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("miaow");
	}
}
public class ClasscastExceptionExample {
	public static void main(String[] args) {
		Animal dog = new Dog();
		try {
		changeDog(dog);
		} catch (ClassCastException e) {
			System.out.println("변환불가");
		}
		
		Animal cat = new Cat();
		try {
		changeDog(cat);
		} catch(ClassCastException e) {
			System.out.println("변환불가");
		}
	}
	public static void changeDog(Animal animal) throws ClassCastException {
//		try {
//		if(animal instanceof Dog) { //인스턴스가 맞는지
			Dog dog = (Dog) animal;
			dog.sound();
//		} else {
//			System.out.println("변경할수없는 클래스");
//		}
		
		
//		} catch (ClassCastException e) {
//			System.out.println("형변환불가");
//		}
	}
}
