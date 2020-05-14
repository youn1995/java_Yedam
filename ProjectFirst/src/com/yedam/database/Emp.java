package com.yedam.database;

public class Emp {
	private int employeeId;
	private String lastName;
	private String hireDate;
	private int salary;

	public Emp(String lastName, String hireDate) {
		this.lastName = lastName;
		this.hireDate = hireDate;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void showInfo() {
		System.out.println("사원번호: " + employeeId + " 이름: " + lastName + " 급여: " + salary + " 입사일: " + hireDate);
	}

}
