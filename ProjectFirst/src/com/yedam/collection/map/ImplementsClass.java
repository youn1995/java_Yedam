package com.yedam.collection.map;

interface Runnable<T> {
	public void run(T t);
}

class Car implements Runnable<String>{

	@Override
	public void run(String str) {
		System.out.println("자동차 달린다");
	}
	
}

class Bus implements Runnable<String>{

	@Override
	public void run(String val) {
		System.out.println("버스 달린다");
		
	}
	
}

public class ImplementsClass {
	//메소드 구현
	public static void callRun(Runnable<String> runnable) {
		runnable.run("Hi");
	}
	
	public static void main(String[] args) {
		Runnable<String> runnable = new Car();
		runnable.run("car");
		runnable = new Bus();
		runnable.run("bus");
		runnable = new Runnable<String>() {
			@Override
			public void run(String str) {
				System.out.println("달린다");
			}
		};
		runnable.run("Run");
		
		runnable = (str) -> System.out.println("달려라");
		runnable.run("달린다");
		
		callRun(new Car());
		callRun(new Runnable<String>() {
			@Override
			public void run(String str) {
				System.out.println("메소드 매개값 달린다");
			}
		});
		callRun((str)-> System.out.println("람다 매소드 달려라"));
		
		
	}

}
