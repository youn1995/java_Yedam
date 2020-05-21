package com.yedam.generic;

public class Container <T,V> {
	T obj;
	V value;

	T getObj() {
		return obj;
	}
	void set(T obj, V value) {
		this.obj = obj;
		this.value = value;
	}
	
	V getValue() {
		return value;
	}

	
}
