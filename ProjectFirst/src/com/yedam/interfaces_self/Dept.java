package com.yedam.interfaces_self;

public class Dept {
	private int departmentId;
	private String departmentName;
	private int managerId;
	private int LocationId;

	public Dept(int departmentId, String departmentName, int managerId, int locationId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
		LocationId = locationId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getLocationId() {
		return LocationId;
	}

	public void setLocationId(int locationId) {
		LocationId = locationId;
	}

	@Override
	public String toString() {
		return "Dept [departmentId=" + departmentId + ", departmentName=" + departmentName + ", managerId=" + managerId
				+ ", LocationId=" + LocationId + "]";
	}

}
