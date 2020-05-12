package com.yedam.classes.inherit;

public class Parent {
	private String lastName;
	private String firstName;
	private String telNumber;
	
	private Parent() {
		
	}

	public Parent(String lastName, String firstName, String telNumber) {
		super(); // object 클래스 상속. 모든클래스는 object를 상속받음
		this.lastName = lastName;
		this.firstName = firstName;
		this.telNumber = telNumber;
	}
	

	String getLastName() {
		return lastName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected String getFirstName() {
		return firstName;
	}

	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	@Override
	public String toString() {
		return "last_name=" + lastName + " firstname= " + firstName;
	}
	
	
	
}
