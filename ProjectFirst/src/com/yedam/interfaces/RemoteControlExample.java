package com.yedam.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		//Audio audio = new Audio();
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		//Television tv = new Television();
		rc = new Television();
		rc.turnOff();
		rc.turnOn();
		
		//익명객체.
		RemoteControl rc2 = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("익명객체를 켭니다");
			}

			@Override
			public void turnOff() {
				System.out.println("익명객체를 끕니다.");
			}
			
		};	//세미콜론을 꼭붙여야함
		rc2.turnOn();
		rc2.turnOff();
	}
}
