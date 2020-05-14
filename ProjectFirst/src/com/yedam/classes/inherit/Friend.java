package com.yedam.classes.inherit;

public class Friend {
	String name;
	String phoneNumber;

	public Friend(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	//public void setName(String name) {
	//	this.name = name;
	//}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	//public void setPhoneNumber(String phoneNumber) {
	//	this.phoneNumber = phoneNumber;
	//}

	void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNumber);
	}
}
