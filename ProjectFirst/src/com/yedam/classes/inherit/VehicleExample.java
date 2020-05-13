package com.yedam.classes.inherit;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run();
							//
		vehicle = new Bus(); //부모클래스 변수 = (자동형변환) 자식클래스 인스턴스
		vehicle.run();
		vehicle = new Taxi();
		vehicle.run();
								
		//Taxi taxi = vehicle;//부모클래스의 변수는 자식클래스로 자동형변환이 안됨
		Taxi taxi = (Taxi) vehicle; //자식클래스 = (강제형변환) 부모클래스
		
	}
}
