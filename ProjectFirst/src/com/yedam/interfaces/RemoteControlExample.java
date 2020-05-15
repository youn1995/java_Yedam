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
	}
}
