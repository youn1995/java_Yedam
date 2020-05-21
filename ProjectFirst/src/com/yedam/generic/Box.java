package com.yedam.generic;

public class Box<T> { //type파라미터(영어대문자 1자)
	T object;

	void set(T object) {
		this.object = object;
	}
	
	T get() {
		return object;
	}
}
