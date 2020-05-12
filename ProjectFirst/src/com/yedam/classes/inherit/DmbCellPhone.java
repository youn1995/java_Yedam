package com.yedam.classes.inherit;

public class DmbCellPhone extends CellPhone{
	int channel;

	public DmbCellPhone(String model, String color) {
		super(model, color); //super => CellPhone(a,b);
	}
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color); //super => CellPhone(a,b);
		this.channel = channel;
	}
	void powerOn(int a) { //void powerOn(int a)는 override가 아님 부모는 매게변수를 받지않음
		System.out.println(a+"채널의 dmb폰을 켭니다.");
	}
	
	@Override //안써도되지만 문법체크용
	void powerOn() {
		System.out.println("dmb폰의 전원을 켭니다");
	}
	@Override
	void powerOff() {
		System.out.println("DMb폰의 전원을 끕니다");
	}

	void turnOnDmb() {
		System.out.println("채널: "+ channel + "번 방송을 수신.");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널: "+ channel + "번으로 변경");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 수신을 종료함.");
	}

}