package com.yedam.classes.inherit;

public class Company extends Friend {
	String department;

	public Company(String name, String phoneNumber, String depratment) {
		super(name, phoneNumber);
		this.department = depratment;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	void showInfo() {
		super.showInfo();
		System.out.println("부서: " + department);
	}

}
