package com.yedam.classes.inherit;

public class University extends Friend {
	String major;

	public University(String name, String phoneNumber, String major) {
		super(name, phoneNumber);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	void showInfo() {
		super.showInfo();
		System.out.println("전공: " + major);
	}

}
