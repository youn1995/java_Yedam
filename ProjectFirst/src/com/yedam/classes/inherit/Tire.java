package com.yedam.classes.inherit;

public class Tire {
	public int maxRotation; // 타이어 수명
	public int accumulatedRotaion; // 현재 사용된 회전수
	public String location;

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumulatedRotaion;
		if (accumulatedRotaion < maxRotation) {
			System.out.println(location + " Tire 수명 " + (maxRotation - accumulatedRotaion) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}//end of roll

}
