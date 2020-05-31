package com.yedam.multithreads;

public class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");
	}
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() +"출력한 내용");
		}
	}
}
