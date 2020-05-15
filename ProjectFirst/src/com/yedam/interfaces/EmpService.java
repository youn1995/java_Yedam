package com.yedam.interfaces;

public interface EmpService {
	//기능정의. 구현x
	//한건 생성
	public void createEmp(Employee emp); //public abstract void createEmp();와 동일
	//전체조회
	public void getEmplist();
	//한건 수정
	public void changeEmp(Employee emp);
	//한건 삭제
	public void removeEmp(int empId);
	
	
	
}
