package com.yedam.interfaces_self;

public class DeptServiceImpl implements DeptService {
	DeptDAO dao = new DeptDAO();

	@Override
	public void createDept(Dept dept) {
		dao.insertDept(dept);
	}

	@Override
	public void getDeptList() {
		for (Dept dept : dao.getDeptList()) {
			if (dept != null) {
				System.out.println(dept.toString());
			}
		}
	}

	@Override
	public void changeDept(Dept dept) {
		dao.updateDept(dept);
	}

	@Override
	public void removeDept(int deptId) {
		dao.deleteDept(deptId);
	}

}
