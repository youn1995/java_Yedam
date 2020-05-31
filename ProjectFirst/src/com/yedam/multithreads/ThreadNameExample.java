package com.yedam.multithreads;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드이름 "+mainThread.getName());
		
		Thread threadA = new ThreadA();
		System.out.println("작업스레드이름 "+threadA.getName());
		threadA.start();
	}
}
