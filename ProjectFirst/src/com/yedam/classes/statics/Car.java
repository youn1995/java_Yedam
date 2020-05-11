package com.yedam.classes.statics;

public class Car {
	private int speed; //초기값 0
	private boolean stop; //default는 false
	
	void setSpeed(int speed) {
		if(speed < 0)
			this.speed = 0;
		else
			this.speed = speed;
	}
	
	int getSpeed() {
		return this.speed;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
	
}
