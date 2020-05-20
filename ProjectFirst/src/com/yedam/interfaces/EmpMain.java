package com.yedam.interfaces;

import java.util.Scanner;


public class EmpMain {
	public static void main(String[] args) {
		// 1.번선택 입력 2.선택 전체리스트 3.수정 4삭제 5.종료
		Scanner scn = new Scanner(System.in);
		EmpService service = new EmpServiceImpl();
		 
		while (true) {
			System.out.println("============================================");
			System.out.println("1.입력, 2.전체리스트 조회, 3.수정, 4.삭제, 5.종료");
			System.out.println("============================================");
			System.out.print("입력>");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.print("사원번호 입력: ");
				int empId = new InputExceptionCheck().intTypeNumCHeck();
				System.out.print("성 입력: ");
				String lastName =  new InputExceptionCheck().StringTypeCHeck();
				System.out.print("급여 입력: ");
				int salary = new InputExceptionCheck().intTypeNumCHeck();
				System.out.print("입사일(YYYY/MM/DD): ");
				String hireDate = scn.nextLine();
				Employee emp = new Employee(empId, lastName, salary, hireDate);
				
				service.createEmp(emp);
			} else if (menu == 2) {
				service.getEmplist();
			} else if (menu == 3) {
				System.out.println("급여를 수정하고 싶은 사원번호를 입력하시오");
				System.out.print("입력 >");
				int empId = scn.nextInt();
				System.out.println("얼마로 수정하시겠습니까?");
				System.out.print("입력>");
				int salary = scn.nextInt();
				Employee emp = new Employee(empId, "", salary, "");
				service.changeEmp(emp);
			} else if (menu == 4) {
				System.out.println("삭제하고 싶은 사원번호를 입력하시오");
				System.out.print("입력 >");
				int empId = scn.nextInt();
				service.removeEmp(empId);
			} else if (menu == 5) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
