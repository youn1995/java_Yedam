package com.yedam.classes.statics;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getISingleton() {
		return singleton;
	}
}
