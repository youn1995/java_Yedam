package com.yedam.interfaces_self;

import java.util.Scanner;

public class DeptMain {
	Scanner scn = new Scanner(System.in);
	DeptService service = new DeptServiceImpl();

	// 1.조회,2.입력,3.업데이트.4삭제 5.종료
	public void execute() {
		while (true) {
			System.out.println("----------Department----------");
			System.out.println("1.List");
			System.out.println("2.Insert");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			System.out.println("5.Exit");
			System.out.println("------------------------------");
			System.out.print("Enter Number > ");
			int userInput = checkUserInput();
			if (userInput == 1) {
				listDept();
			} else if (userInput == 2) {
				insertDept();
			} else if (userInput == 3) {
				updateDept();
			} else if (userInput == 4) {
				deleteDept();
			} else if (userInput == 5) {
				break;
			}
		}
		System.out.println("Program End");
	}

	public void listDept() {
		System.out.println("Search all department");
		service.getDeptList();
		System.out.println();
		System.out.println("Enter to continue...");
		scn.nextLine();
	}

	public void insertDept() {
		System.out.println("Create department");
		System.out.print("Enter Department ID > ");
		int deptId = checkUserInt();
		System.out.print("Enter Department Name > ");
		String deptName = scn.nextLine();
		System.out.print("Enter Manager ID > ");
		int deptManagerId = checkUserInt();
		System.out.print("Enter Location ID > ");
		int deptLocationId = checkUserInt();
		Dept dept = new Dept(deptId, deptName, deptManagerId, deptLocationId);
		service.createDept(dept);
		System.out.println();
		System.out.println("Enter to continue...");
		scn.nextLine();
	}

	public void updateDept() {
		System.out.println("Change Department name");
		System.out.println("Which department do you change?");
		System.out.print("Enter Department ID > ");
		int deptId = checkUserInt();
		System.out.print("New department name > ");
		String deptName = scn.nextLine();
		Dept dept = new Dept(deptId, deptName, 0, 0);
		service.changeDept(dept);
		System.out.println();
		System.out.println("Enter to continue...");
		scn.nextLine();
	}

	public void deleteDept() {
		System.out.println("Delete department");
		System.out.println("Which department do you delete?");
		System.out.print("Enter Department ID > ");
		int deptId = checkUserInt();
		service.removeDept(deptId);
		System.out.println();
		System.out.println("Enter to continue...");
		scn.nextLine();
	}

	int checkUserInput() {
		int checkInput = 0;
		while (true) {
			try {
				checkInput = scn.nextInt();
				scn.nextLine();
				if (checkInput >= 1 && checkInput <= 5) {
					break;
				} else {
					scn = new Scanner(System.in);
					System.out.print("Enter Correct Number > ");
				}
			} catch (Exception e) {
				scn = new Scanner(System.in);
				System.out.print("Enter Only Number > ");
			}
		}
		return checkInput;
	}

	int checkUserInt() {
		int checkInt = 0;
		while (true) {
			try {
				checkInt = scn.nextInt();
				scn.nextLine();
				break;
			} catch (Exception e) {
				scn = new Scanner(System.in);
				System.out.print("Enter Only Number > ");
			}
		}
		return checkInt;
	}
}
