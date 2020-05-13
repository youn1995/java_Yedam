package com.yedam.classes.inherit;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotaion;
		if (accumulatedRotaion < maxRotation) {
			System.out.println(location + " HankookTire 수명 " + (maxRotation - accumulatedRotaion) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
	
}
